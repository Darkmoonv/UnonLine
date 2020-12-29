package com.zs.ssm.dao;
import com.zs.ssm.domain.Orders;
import com.zs.ssm.domain.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper extends BaseMappper<User>{
    //删除旧的用户和角色的关系
    void deleteRelation(Integer id);
    //新增用户和角色的关系
    void insertNewRelation(Integer id,List<Integer> roleId);

    public List<User> findAllUser();

    //public User findUsernameAndPassword(@Param("username") String username,@Param("password") String password);
}
