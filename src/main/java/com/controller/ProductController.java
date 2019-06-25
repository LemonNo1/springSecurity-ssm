package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/prod")
public class ProductController {

    /**
     * 主页
     */
    @RequestMapping("/index")
    public String index() {
        return "iframe/index";
    }

    /**
     * 商品添加
     */
    @RequestMapping("/add")
    public String add() {
        return "product/productAdd";
    }

    /**
     * 商品修改
     */
    @RequestMapping("/update")
    public String update() {
        return "product/productUpdate";
    }

    /**
     * 商品修改
     */
    @RequestMapping("/list")
    public String list() {
        return "product/productList";
    }

    /**
     * 商品删除
     */
    @RequestMapping("/delete")
    public String delete() {
        return "product/productDelete";
    }

}
