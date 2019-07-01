package com.controller;

import com.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;

@RequestMapping("role")
public class RoleController {
    @Autowired
    private RoleService roleService;

    Map<String, Object> mapData = new HashMap<>();


}
