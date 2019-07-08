package com.mapper;

import com.domain.Permission;

import java.util.List;
import java.util.Map;

public interface MenuMapper {

    List<Permission> selectMenuList(Map<String, Object> map);

    List<Permission> selectMenuParent();

    /**
     * 插入菜单
     * @param map
     */
    void insertIntoMenu(Map<String, Object> map);

    /**
     * 获取子菜单
     * @param map
     * @return
     */
    List<Permission> selectMenuChild(Map<String,Object> map);

    void delete(String id);
}
