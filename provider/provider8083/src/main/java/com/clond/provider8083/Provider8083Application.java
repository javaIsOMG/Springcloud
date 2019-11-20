package com.clond.provider8083;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

@EnableCircuitBreaker//熔断断路器功能
@EnableEurekaClient
@SpringBootApplication
public class Provider8083Application {

    public static void main(String[] args) {

        SpringApplication.run(Provider8083Application.class, args);
    }
    @Bean
    public ServletRegistrationBean getServlet(){

        HystrixMetricsStreamServlet streamServlet = new HystrixMetricsStreamServlet();

        ServletRegistrationBean registrationBean = new ServletRegistrationBean(streamServlet);

        registrationBean.setLoadOnStartup(1);

        registrationBean.addUrlMappings("/actuator/hystrix.stream");

        registrationBean.setName("HystrixMetricsStreamServlet");


        return registrationBean;
    }

}
