package com.clond.provider8083.Controller;

import com.clond.common.Entity.Dept;
import com.clond.provider8083.Service.DeptService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Controller {
    @Autowired
    private DeptService detpService;
    @HystrixCommand(fallbackMethod = "getHystix")//熔断注解
    @RequestMapping("/heyinghao1")
    public List<Dept> findAll(){
        return detpService.findAll();
    }
    public List<Dept> getHystix(){ //备用方法
        List<Dept> list=new ArrayList<>();
        Dept dept = new Dept(1001, "error", "服务熔断");
        list.add(dept);
        return list;
    }
}
