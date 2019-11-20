package com.clond.common.api;

import com.clond.common.Entity.Dept;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
//指定要调用provider的微服务名称,指定降级服务的降级工厂
@FeignClient(value = "provider8001-Dept",fallbackFactory = DeptClientFallBackFactory.class)
public interface DeptService {
    @RequestMapping(value = "/heyinghao1",method = RequestMethod.GET)
    public List<Dept> findAll();
}
