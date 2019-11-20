package com.clond.controller;

import com.clond.common.Entity.Dept;
import com.clond.common.api.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FeiginnController {
    @Autowired
    private DeptService deptService;
    @RequestMapping("/consummer/findAll")
    public List<Dept> finAll(){
        return deptService.findAll();
    }
}
