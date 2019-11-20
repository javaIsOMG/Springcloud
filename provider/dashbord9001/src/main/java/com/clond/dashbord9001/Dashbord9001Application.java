package com.clond.dashbord9001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
//启用Hystrix的仪表盘
@EnableHystrixDashboard
@SpringBootApplication
public class Dashbord9001Application {

    public static void main(String[] args) {
        SpringApplication.run(Dashbord9001Application.class, args);
    }

}
