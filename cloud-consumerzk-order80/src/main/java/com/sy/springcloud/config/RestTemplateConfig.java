package com.sy.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Auther: lihang
 * @Date: 2020-12-06 15:25
 * @Description:
 */
@Configuration
public class RestTemplateConfig {

    @Bean
    @LoadBalanced  // 负载均衡
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
