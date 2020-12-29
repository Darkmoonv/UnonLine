package com.zs.ssm.service;

import com.zs.ssm.domain.Role;

import java.util.List;

public interface RoleService extends BaseService<Role>{
    public List<Role> findAllRole();
}
