package com.example.basicsprgboot2025.service.impl;

import com.example.basicsprgboot2025.domain.Sboard;
import com.example.basicsprgboot2025.repository.Sboardrepo;
import com.example.basicsprgboot2025.service.SboardService2;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class SboardService2Impl implements SboardService2 {

    final Sboardrepo sboardrepo;
    public SboardService2Impl(Sboardrepo sboardrepo) {
        this.sboardrepo = sboardrepo;
    }

    @Override
    public Map<String, Object> create(Map<String, Object> param) {
        String title = (String) param.get("title");
        String content = (String) param.get("content");
        String author = (String) param.get("author");

        Sboard sboard = new Sboard(title, content, author);
        sboardrepo.save(sboard);

        Map<String, Object> result = new HashMap<>();
        result.put("id", sboard.getId());

        return result;
    }
    @Override
    public void update(Map<String, Object> param) {
        Long tempId = Long.parseLong((String) param.get("id"));
        Sboard sboard = sboardrepo.findById(tempId).orElse(null);
        if(sboard != null) {
            if(param.get("title") != null){
                String title = (String) param.get("title");
                sboard.setTitle(title);
            }
            if(param.get("content") != null){
                String content = (String) param.get("content");
                sboard.setContent(content);
            }
            if(param.get("author") != null){
                String author = (String) param.get("author");
                sboard.setAuthor(author);
            }
            sboardrepo.save(sboard);
        }

    }


    @Override
    public void delete(int id) {
        Long tempId = (long) id;
        Sboard sboard = sboardrepo.findById(tempId).orElse(null);
        if(sboard != null) {
            sboardrepo.delete(sboard);
        }
    }

    @Override
    public Sboard detail(int id) {
        Long tempId = (long) id;
        Sboard sboard = sboardrepo.findById(tempId).orElse(null);
        return sboard;
    }

    @Override
    public List<Sboard> list() {
        List<Sboard> sboardList = sboardrepo.findAll();
        return sboardList;
    }
}
