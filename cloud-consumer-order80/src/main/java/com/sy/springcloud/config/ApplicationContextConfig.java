package com.sy.springcloud.config;


import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author:lihang
 * @create:2020-08-23 22:04
 */
@Configuration
public class ApplicationContextConfig {

    @Bean
    @LoadBalanced  // 赋予restTemplate负载均衡的能力
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
