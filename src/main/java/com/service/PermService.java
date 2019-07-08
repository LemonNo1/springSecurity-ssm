package com.service;

import com.domain.Menus;
import com.domain.Permission;

import java.util.List;
import java.util.Map;

public interface MenuService {
    List<Permission> selectMenuList(Map<String, Object> map) throws Exception;

    List<Permission> selectMenuParent() throws Exception;

    /**
     * 插入菜单
     * @param map
     */
    void insertIntoMenu(Map<String, Object> map) throws Exception;


    /**
     * 获取子菜单
     * @param map
     * @return
     */
    List<Permission> selectMenuChild(Map<String,Object> map);

    /**
     * 获取权限子父级关系
     * @return
     */
    List<Menus> getMenus();

    void delete(String id) throws Exception;
}
