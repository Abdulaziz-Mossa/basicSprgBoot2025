package com.example.basicsprgboot2025.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("api/post")
public class PostRestCrtl {
    int count=0;
    List<Map<String,Object>> list=new ArrayList<Map<String, Object>>();

    @RequestMapping("/create")
    public Map<String,Object> create(String title,String content, String author){
        Map<String,Object> post=new HashMap<>();
        post.put("title",title);
        post.put("content",content);
        post.put("author",author);
        post.put("id",++count);

        list.add(post);
        Map<String,Object> resultValue=new HashMap<>();
        resultValue.put("resultValue","posted");
        return resultValue;
    }
    @RequestMapping("/update")
    public void update(String id,String title, String content, String author){

        Map<String , Object> post=detail(id);

        if(title != null && !title.isEmpty()){
            post.put("title",title);
        }
        if(content != null && !content.isEmpty()){
            post.put("content",content);
        }
        if(author != null && !author.isEmpty()){
            post.put("author",author);
        }
    }

    @RequestMapping("/delete")
    public void delete(String id){
        Map<String , Object> post=detail(id);
        post.remove("content");
        post.remove("author");
        post.remove("title");
    }

    @RequestMapping("/list")
    public List<Map<String, Object>> list() {
        return list;
    }
    @RequestMapping("detail")
    public Map<String, Object> detail(String id){
        for(Map<String,Object> each : list){
            if((each.get("id")+"").equals(id)){
                return each;
            }
        }
        return null;
    }

}
