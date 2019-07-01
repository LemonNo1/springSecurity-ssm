package com.service.impl;

import com.domain.Role;
import com.mapper.RoleUserMapper;
import com.service.RoleUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
@Service
public class RoleUserServiceImpl implements RoleUserService {

    @Autowired
    private RoleUserMapper roleUserMapper;

    @Override
    public void insertRoleUser(Map<String, Object> map) throws Exception {
        roleUserMapper.insertRoleUser(map);
    }
}
