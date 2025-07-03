package com.example.basicsprgboot2025.controller;

import com.example.basicsprgboot2025.controller.service.SboardService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/sboard")
public class SboardRestCtrl {
    final SboardService sboardService;
    SboardRestCtrl(SboardService sboardService){
        this.sboardService = sboardService;
    }
    @RequestMapping("/create")
    public Map<String,Object> create (@RequestParam Map<String,Object> param){
        return sboardService.create(param);
    }
    @RequestMapping("/update")
    public void update (Map<String,Object> param) {
        sboardService.update(param);

    }
    @RequestMapping("/delete")
    public void delete (int id) {
        sboardService.delete(id);
    }
    @RequestMapping("/detail")
    public Map<String,Object> detail (int id) {
        return sboardService.detail(id);
    }
    @RequestMapping("/list")
    public List<Map<String,Object>> list(String title){
        return sboardService.list(title);
    }

}
