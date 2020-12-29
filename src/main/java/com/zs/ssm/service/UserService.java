package com.zs.ssm.service;

import com.github.pagehelper.PageInfo;
import com.zs.ssm.domain.Orders;
import com.zs.ssm.domain.Role;
import com.zs.ssm.domain.User;

import java.util.List;
public interface UserService extends BaseService<User>{
    //注册接口
    public void registeredUser(User user);
    //登录接口
    public User loginUser(User user);
    //查找所有货物
    public List<Orders> findAllOrders();
    //条件查询
    public User findUser(User user);
    //分页查询所有用户信息
    public PageInfo<User> getPageInfo(Integer pageNum,Integer pageSize);
    //不分页查找所有用户信息
    public List<User> findAll();
    //保存user和role的关系
    public void saveUserAndRoleRelation(Integer id,List<Integer> roleId);
}
