package com.clond.zuul9002;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class Zuul9002Application {

    public static void main(String[] args) {
        SpringApplication.run(Zuul9002Application.class, args);
    }

}
