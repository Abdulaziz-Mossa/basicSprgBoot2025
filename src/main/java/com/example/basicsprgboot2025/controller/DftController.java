package com.example.basicsprgboot2025.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class DftController {
    @ResponseBody
    @RequestMapping("/test")
    public String test(){

        return "test here";
    }
    @ResponseBody
    @RequestMapping("/test2")
    public Map<String,Object> test2(){
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("key1","value1");
        return map;
    }
    @RequestMapping("/page1")
    public String page1(){
        return "page1";
    }
}
