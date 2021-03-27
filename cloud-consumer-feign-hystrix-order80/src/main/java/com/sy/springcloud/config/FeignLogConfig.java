package com.sy.springcloud.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Auther: lihang
 * @Date: 2020-12-09 21:20
 * @Description:
 */
@Configuration
public class FeignLogConfig {

    @Bean
    Logger.Level setFeignLoggerLevel(){
        return Logger.Level.FULL;
    }
}
