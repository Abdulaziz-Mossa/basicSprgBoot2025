package com.example.basicsprgboot2025.controller.page;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sboard")
public class SboardCtrl {
    @RequestMapping("/{page}")
    public String page(@PathVariable String page){
        return "sboard/"+page ;
    }
    @RequestMapping("/{page}/{id}")
    public String page(@PathVariable String page ,@PathVariable String id){
        return "sboard/"+page;
    }
}
