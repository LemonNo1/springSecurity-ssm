package com.controller;

import com.domain.Role;
import com.domain.User;
import com.service.RoleService;
import com.service.RoleUserService;
import com.service.UserService;
import com.utils.DateUtil;
import com.utils.ResultUtil;
import org.apache.ibatis.annotations.Param;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping("/user")
@Controller
public class UserController {

    public static final Logger logger = LoggerFactory.getLogger(UserController.class);
    @Autowired
    private UserService userService;

    @Autowired
    private RoleService roleService;

    @Autowired
    private RoleUserService roleUserService;
    Map<String, Object> mapData = new HashMap<>();

    @RequestMapping("toFindAll")
    public ModelAndView toUserFindAll() {
        return new ModelAndView("user/userList");
    }

    @ResponseBody
    @RequestMapping("findAll")
    public Map<String, Object> UserFindAll(@RequestParam Map<String, Object> map) {
        mapData.clear();
        try {
            mapData = userService.getUserList(map);
            logger.info("map:" + mapData);
        } catch (Exception e) {
            mapData.put("code", 1);
            e.printStackTrace();
            //返回的数据不符合规范，正确的成功状态码 (code) 应为：0
        }
        return mapData;
    }

    @RequestMapping("toAdd")
    public ModelAndView toAdd(){
        ModelAndView modelAndView = new ModelAndView("user/userAdd");
        List<Role> roles = null;
        try {
            roles = roleService.selectRoleList(null);
        } catch (Exception e) {
            e.printStackTrace();
        }
        logger.info("roles:"+roles);
        modelAndView.addObject("roles",roles);
        return modelAndView;
    }

    @ResponseBody
    @RequestMapping("add")
    public Map<String, Object> add(@RequestParam Map<String, Object> map) {
        mapData.clear();
        try {
            logger.info("客户端传入map:" + map);
            userService.insertIntoUser(map);
            mapData.put("success", true);
            mapData.put("msg", "添加成功");
        } catch (Exception e) {
            mapData.put("success", false);
            mapData.put("msg", "接口异常，添加失败");
            e.printStackTrace();
        }
        return mapData;
    }

    @RequestMapping("toEdit")
    public ModelAndView toEdit(@RequestParam Map<String,Object> map){
        ModelAndView modelAndView = new ModelAndView("user/userEdit");
        try {
            List<Role> roles = roleService.selectRoleList(null);
            User user = userService.selectUserById(map);

            modelAndView.addObject("roles",roles);
            modelAndView.addObject("entity",user);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return modelAndView;
    }

    @ResponseBody
    @RequestMapping("edit")
    public Map<String,Object> updateUser(@RequestParam Map<String,Object> map){
        mapData.clear();
        try {
            userService.updateUser(map);
            ResultUtil.resultMap(mapData,true,"修改成功");
        } catch (Exception e) {
            ResultUtil.resultMap(mapData,false,"修改失败");
            e.printStackTrace();
        }
        return mapData;
    }
}
