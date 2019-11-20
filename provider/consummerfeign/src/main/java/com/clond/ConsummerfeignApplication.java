package com.clond;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableEurekaClient
@EnableFeignClients
@SpringBootApplication  //即使是依赖也必须在主启动下扫描下
public class ConsummerfeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsummerfeignApplication.class, args);
    }

}
