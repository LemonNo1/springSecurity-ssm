package com.service;

import com.domain.Role;

import java.util.List;
import java.util.Map;

public interface RoleService {

    /**
     * 获取所有角色
     * @return
     */
    List<Role> selectRoleList(Map<String,Object> map) throws  Exception;
}
