package com.sy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @Auther: lihang
 * @Date: 2020-12-12 19:41
 * @Description:
 */
@SpringBootApplication
@EnableHystrixDashboard
public class ConsumerDashBoardMain9001 {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerDashBoardMain9001.class,args);
    }
}
