package com.mapper;

import java.util.Map;

public interface RoleUserMapper {

    /**
     * 添加角色用户关联
     */
    void insertRoleUser(Map<String,Object> map);

    /**
     * 校验用户是否存在
     * @param map
     * @return
     */
    Integer checkUserRole(Map<String,Object> map);

    /**
     * 更新角色用户关联
     * @param map
     */
    void updateRoleUser(Map<String,Object> map);
}
