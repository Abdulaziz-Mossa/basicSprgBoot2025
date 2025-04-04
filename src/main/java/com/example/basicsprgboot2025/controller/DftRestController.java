package com.example.basicsprgboot2025.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping("/api")

public class DftRestController {

    @RequestMapping("/index")

    public int index1 (){
    return 1;
    }

    @RequestMapping("/test")
    public List<String> test (@RequestParam String param1,String param2){
        List<String> list = new ArrayList<String>();
        list.add("test1");
        list.add("test2");
        list.add("test3");
        list.add(param1);
        list.add(param2);
        return list;
    }

}
