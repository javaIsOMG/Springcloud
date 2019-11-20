package com.clond.common.api;

import com.clond.common.Entity.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DeptClientFallBackFactory implements FallbackFactory<DeptService> {
//当前类作为我们降级机制的备用方案，必须实现实现FallbackFactory
    @Override
    public DeptService create(Throwable throwable) {
        return new DeptService() {
            @Override
            public List<Dept> findAll() {
                List<Dept> list=new ArrayList<>();
                Dept dept = new Dept(1001, "error", "服务熔断");
                list.add(dept);
                return list;
            }
        };
    }
}
