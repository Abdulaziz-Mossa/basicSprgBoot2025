package com.example.basicsprgboot2025.controller.page;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/board")
public class BoardCtrl {
    @RequestMapping("/create")
    public String create(){
        return"board/create";
    }

    @RequestMapping("/detail")
    public String detail(){
        return "board/detail";
    }
    @RequestMapping("/list")
    public String list(){
        return"board/list";
    }
}
