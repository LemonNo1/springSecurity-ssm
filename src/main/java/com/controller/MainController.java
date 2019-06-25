package com.controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author http://www.sm1234.cn
 * @version 1.0
 * @description cn.sm1234.controller
 * @date 18/4/12
 */
@Controller
public class MainController {


    @RequestMapping("/mainDo")
    public String mainDo(Model model) {
        Object object = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        if (object != null) {
            if (object instanceof UserDetails) {
                UserDetails userDetails = (UserDetails) object;
                String username = userDetails.getUsername();
                model.addAttribute("username", username);
            }
        }
        return "main";
    }

    /**
     * 登录页面
     *
     * @return
     */
    @RequestMapping("/userLogin")
    public String login() {
        return "login";
    }

    /**
     * 错误页面
     *
     * @return
     */
    @RequestMapping("/error")
    public String error() {
        return "error";
    }

    /**
     * 验证码
     *
     * @return
     */
    @RequestMapping("/imageCode")
    public String imageCode() {
        return "imageCode";
    }
}
