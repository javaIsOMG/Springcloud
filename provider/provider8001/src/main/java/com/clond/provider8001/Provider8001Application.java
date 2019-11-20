package com.clond.provider8001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient //启用Eureka客户端功能，让当前微服务可以在Eureka中在注册服务信息也可以获取服务信息---服务的注册和发现
@SpringBootApplication
public class Provider8001Application {

    public static void main(String[] args) {
        SpringApplication.run(Provider8001Application.class, args);
    }

}
