package com.zs.ssm.dao;

import com.zs.ssm.domain.Role;

import java.util.List;

public interface RoleMapper extends BaseMappper<Role> {
    public List<Role> findAll();
}
