package com.zs.ssm.service.impl;

import com.zs.ssm.dao.RoleMapper;
import com.zs.ssm.domain.Role;
import com.zs.ssm.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("roleService")
public class RoleServiceImpl extends BaseServiceImpl<Role> implements RoleService {
    @Autowired
    private RoleMapper roleMapper;
    public List<Role> findAllRole() {
        return roleMapper.findAll();
    }
}
