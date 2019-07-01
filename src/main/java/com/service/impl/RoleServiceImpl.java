package com.service.impl;

import com.domain.Role;
import com.mapper.RoleMapper;
import com.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleMapper roleMapper;

    @Override
    public List<Role> selectRoleList(Map<String, Object> map) throws Exception{
       return roleMapper.selectRoleList(map);
    }
}
