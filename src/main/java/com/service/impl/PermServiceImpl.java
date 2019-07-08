package com.service.impl;

import com.domain.Menus;
import com.domain.Permission;
import com.mapper.PermMapper;
import com.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class MenuServiceImpl implements MenuService {

    @Autowired
    PermMapper menuMapper;

    @Override
    public List<Permission> selectMenuList(Map<String, Object> map) throws Exception {
        return menuMapper.selectMenuList(map);
    }

    @Override
    public List<Permission> selectMenuParent() throws Exception {
        return menuMapper.selectMenuParent();
    }

    @Override
    public void insertIntoMenu(Map<String, Object> map) throws Exception {
        Object object = map.get("parentId");
        if (object == null) {
            String parentId = "0";
            map.put("parentId", parentId);
        }
        menuMapper.insertIntoMenu(map);
    }

    @Override
    public List<Permission> selectMenuChild(Map<String, Object> map) {
        return menuMapper.selectMenuChild(map);
    }

    @Override
    public List<Menus> getMenus() {
        List<Permission> menuChilds = menuMapper.selectMenuChild(null);
        List<Permission> menuParents = menuMapper.selectMenuParent();
        List<Menus> menus = new ArrayList<>();
        for (Permission menuParent : menuParents) {
            Menus menu = new Menus();
            List<Permission> listMenuChild = new ArrayList<>();
            for (Permission menuChild : menuChilds) {
                if (menuParent.getId().equals(menuChild.getParentId())) {
                    listMenuChild.add(menuChild);
                }
            }
            menu.setId(menuParent.getId());
            menu.setParentId(menuParent.getParentId());
            menu.setPermName(menuParent.getPermName());
            menu.setUrl(menuParent.getUrl());
            menu.setPermTag(menuParent.getPermTag());
            menu.setChild(listMenuChild);
            menus.add(menu);
        }
        return menus;
    }

    @Override
    public void delete(String id) throws Exception{
        menuMapper.delete(id);
    }


}
