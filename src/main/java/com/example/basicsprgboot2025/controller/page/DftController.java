package com.example.basicsprgboot2025.controller.page;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class DftController {
    @ResponseBody
    @RequestMapping("/test")//return string "test here !!!"
    public String test(){

        return "test here !!!";
    }
    @ResponseBody
    @RequestMapping("/test2")
    public Map<String,Object> test2(){
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("key1","value1");
        return map;
    }
    @RequestMapping("/index")
    public String page1(){
        return "index";
    }

    @RequestMapping("/test1")//return page view
    public String test1(){
        return "test";//find test.html

    }

    @RequestMapping("/testmodel")
    public String testmodel (Model model){
        model.addAttribute("msg","we are testing");
        model.addAttribute("sum",123);
        return "testmodel";

    }
    @RequestMapping("/testparameter")
    public String testparameter(int a, int b, @RequestParam String c, Model model){
        int result = 0;
        result = a+b;
        model.addAttribute("a",a);
        model.addAttribute("b",b);
        model.addAttribute("result",result);
        return "testparameter";

    }

}
