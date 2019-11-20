package com.clond.consummer.consummer.Config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigBean {
    //RestTemplate是一个Springboot的一个模板类似httpClient，或者底层封装
    @Bean
    @LoadBalanced //是用于负载均衡在Ribbon中
    public RestTemplate getRestTemplate(){
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate;
    }

}
