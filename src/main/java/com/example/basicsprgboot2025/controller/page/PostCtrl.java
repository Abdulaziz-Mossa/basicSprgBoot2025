package com.example.basicsprgboot2025.controller.page;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/post")
public class PostCtrl {
    @RequestMapping("/{page}")
    public String page(@PathVariable String page){
        return "post/"+page;
    }
    @RequestMapping("/{page}/{id}")

    public String Page(@PathVariable String page, @PathVariable String id){
        return "post/"+page;
    }
}
