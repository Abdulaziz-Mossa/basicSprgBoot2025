package com.example.basicsprgboot2025.controller;

import com.example.basicsprgboot2025.domain.Sboard;
import com.example.basicsprgboot2025.service.SboardService;
import com.example.basicsprgboot2025.service.SboardService2;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/sboard")
public class SboardRestCtrl {
    final SboardService sboardService;
    final SboardService2 sboardService2;
    SboardRestCtrl(SboardService sboardService, SboardService2 sboardService2){
        this.sboardService = sboardService;
        this.sboardService2 = sboardService2;
    }
    @RequestMapping("/create")
    public Map<String,Object> create (@RequestParam Map<String,Object> param){
        return sboardService2.create(param);
    }
    @RequestMapping("/update")
    public void update (Map<String,Object> param) {
        sboardService2.update(param);

    }
    @RequestMapping("/delete")
    public void delete (int id) {
        sboardService2.delete(id);
    }
    @RequestMapping("/detail")
    public Sboard detail (int id) {
        return sboardService2.detail(id);
    }
    @RequestMapping("/list")
    public List<Sboard> list(){
        return sboardService2.list();
    }

}
