package com.clond.provider8002.Controller;

import com.clond.common.Entity.Dept;
import com.clond.provider8002.Service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class DetpController {
    @Autowired
    private DeptService detpService;
    @ResponseBody
    @RequestMapping(value = "/heyinghao",method = RequestMethod.POST)
    public boolean findAll(@RequestBody Dept detp){
        return detpService.addDept(detp);
    }
    @ResponseBody
    @RequestMapping(value = "/heyinghao1",method = RequestMethod.GET)
    public List<Dept> findAll()
    {
        return detpService.findAll();
    }
}
