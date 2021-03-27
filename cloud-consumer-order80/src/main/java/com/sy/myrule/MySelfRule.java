package com.sy.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Auther: lihang
 * @Date: 2020-12-06 22:20
 * @Description:
 */
@Configuration
public class MySelfRule {

    @Bean
    public IRule createRandomRule(){
        return new RandomRule();
    }
}
