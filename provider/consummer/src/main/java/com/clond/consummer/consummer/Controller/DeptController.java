package com.clond.consummer.consummer.Controller;

import com.clond.common.Entity.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class DeptController {
    //此处使用直接调用的方法，没有使用注册中心
    private static final String REST_URL_PREFIX="http://provider8001-Dept";
//    private static final String REST_URL_PREFIX="http://localhost:8080";
    @Autowired
    private RestTemplate restTemplate;
    @RequestMapping("/consummer/finAll")
    public List<Dept> finAll(){
        return restTemplate.getForObject(REST_URL_PREFIX+"/heyinghao1",List.class);
    }
}
