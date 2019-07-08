package com.controller;

import com.domain.Permission;
import com.frame.PageBaseResult;
import com.service.PermService;
import com.utils.PageBaseResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;

@RequestMapping("menu")
@Controller
public class PermController {

    @Autowired
    PermService menuService;

    @RequestMapping("/toFindAll")
    public ModelAndView toFindAll() {
        ModelAndView modelAndView = new ModelAndView("menu/menuList");
        return modelAndView;
    }

    @ResponseBody
    @RequestMapping("/findAll")
    public PageBaseResult findAll(Map<String, Object> map) {
        try {
            List<Permission> permissions = menuService.selectPermList(map);
            return PageBaseResultUtil.success(permissions);
        } catch (Exception e) {
            e.printStackTrace();
            return PageBaseResultUtil.failure();
        }
    }

    @RequestMapping("/toAdd")
    public ModelAndView toAdd() {
        ModelAndView modelAndView = new ModelAndView("menu/menuAdd");
        try {
            List<Permission> menuParents = menuService.selectPermParent();
            modelAndView.addObject("menuParents", menuParents);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return modelAndView;
    }

    @ResponseBody
    @RequestMapping("/add")
    public PageBaseResult add(@RequestParam Map<String, Object> map) {
        try {
            menuService.insertIntoPerm(map);
            return PageBaseResultUtil.success();
        } catch (Exception e) {
            e.printStackTrace();
            return PageBaseResultUtil.failure();
        }
    }

    @ResponseBody
    @RequestMapping("delete")
    public PageBaseResult delete(@RequestParam("id") String id){
        menuService.delete(id);
    }

}
