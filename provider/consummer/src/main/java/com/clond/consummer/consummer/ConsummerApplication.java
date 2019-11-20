package com.clond.consummer.consummer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ConsummerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsummerApplication.class, args);
    }

}
