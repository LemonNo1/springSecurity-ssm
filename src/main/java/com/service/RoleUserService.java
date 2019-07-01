package com.service;

import java.util.Map;

public interface RoleUserService {

    /**
     * 添加角色用户关联
     */
    void insertRoleUser(Map<String,Object> map) throws Exception;


}
