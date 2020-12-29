package com.zs.ssm.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zs.ssm.dao.OrdersMapper;
import com.zs.ssm.dao.UserMapper;
import com.zs.ssm.domain.Orders;
import com.zs.ssm.domain.Role;
import com.zs.ssm.domain.User;
import com.zs.ssm.service.BaseService;
import com.zs.ssm.service.UserService;
import com.zs.ssm.ssmexception.LoginFailedException;
import com.zs.ssm.ssmexception.RegisteredException;
import com.zs.ssm.utils.PasswordPMD;
import com.zs.ssm.utils.ResultPool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserServiceImpl extends BaseServiceImpl<User> implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private OrdersMapper ordersMapper;

    public void registeredUser(User user) {
        if (user==null){
            throw new RegisteredException(ResultPool.MESSAGE_REGISTERED_MSG);
        }
        User preUser=userMapper.find(user);
        if (preUser!=null){
           if (preUser.getUsername().equals(user.getUsername())){
               throw new RegisteredException(ResultPool.MESSAGE_LOGIN_INUSE);
           }
           throw new RegisteredException(ResultPool.MESSAGE_REGISTERED_IN_USE);
        }
        user.setPassword(PasswordPMD.Pmd(user.getPassword()));
        userMapper.add(user);
        System.out.println(user.getPassword());
    }
    public User loginUser(User user) {
        if (user==null){
            throw new LoginFailedException(ResultPool.REGISTERED_FAILED_USERNAME);
        }
        user.setPassword(PasswordPMD.Pmd(user.getPassword()));
        User loginUser=userMapper.find(user);
        String password=user.getPassword();
        String loginPassword=loginUser.getPassword();
        if ((user.getUsername().equals(loginUser.getUsername()))&&
                (password.equals(loginPassword))){
            return loginUser;
        }
        throw new LoginFailedException(ResultPool.MESSAGE_LOGIN_FAILED);
    }
    public List<Orders> findAllOrders() {
        return ordersMapper.findAllOrders();
    }

    public User findUser(User user) {
        return null;
    }

    public PageInfo<User> getPageInfo(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<User> userList=userMapper.findAllUser();
        return new PageInfo<User>(userList);
    }
    public void replaceUser(User user) {
        if (user==null){
            throw new LoginFailedException(ResultPool.MESSAGE_REPLACE_MSG);
        }
        user.setPassword(PasswordPMD.Pmd(user.getPassword()));
        User checkUser=userMapper.find(user);
        if (user.getUsername().equals(checkUser.getUsername())){
            throw new LoginFailedException(ResultPool.MESSAGE_LOGIN_INUSE);
        }
        String password=user.getPassword();
        String checkPassword=checkUser.getPassword();
        if (password.equals(checkPassword)){
            throw new LoginFailedException(ResultPool.MESSAGE_REPLACE_PASSWORD);
        }
        userMapper.replace(user);
    }

    public List<User> findAll() {
        return userMapper.findAllUser();
    }

    public void saveUserAndRoleRelation(Integer id, List<Integer> roleId) {
        userMapper.deleteRelation(id);
        if (roleId!=null){
            userMapper.insertNewRelation(id,roleId);
        }
    }

}
