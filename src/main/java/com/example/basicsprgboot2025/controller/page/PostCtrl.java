package com.example.basicsprgboot2025.controller.page;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/post")
public class PostCtrl {
    @RequestMapping("/create")
    public String create(){
        return "post/create";
    }
    @RequestMapping("/detail")
    public String detail(){
        return "post/detail";
    }
    @RequestMapping("/list")
    public String list(){
        return "post/list";
    }
}
