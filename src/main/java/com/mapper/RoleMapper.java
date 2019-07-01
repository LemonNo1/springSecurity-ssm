package com.mapper;

import com.domain.Role;

import java.util.List;
import java.util.Map;

public interface RoleMapper{

    /**
     * 获取所有角色
     * @return
     */
    List<Role> selectRoleList(Map<String,Object> map);
}
