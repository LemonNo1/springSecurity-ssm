package com.controller;

import com.service.RoleUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;

@RequestMapping("roleUser")
@Controller
public class RoleUserController {

    @Autowired
    private RoleUserService roleUserService;

    Map<String,Object> mapData = new HashMap<>();
    @RequestMapping("add")
    public Map<String,Object> insertRoleUser(Map<String,Object> map){
        try {
            roleUserService.insertRoleUser(map);
            mapData.put("success",true);
            mapData.put("msg","添加成功");
        } catch (Exception e) {
            mapData.put("success",false);
            mapData.put("msg","添加失败");
            e.printStackTrace();
        }
        return mapData;
    }
}
