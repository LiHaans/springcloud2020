package com.sy.springcloud.controller;

import cn.hutool.core.util.IdUtil;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.sy.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Auther: lihang
 * @Date: 2020-12-09 20:26
 * @Description:
 */
@RestController
@Slf4j
@DefaultProperties(defaultFallback = "globalFallBack",commandProperties = {
        @HystrixProperty(name="execution.isolation.thread.timeoutInMilliseconds",value="8000")
})
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @GetMapping("/payment/hystrix/ok")
    public String paymentHystrixOK(){
        return paymentService.paymentInfo_OK();
    }

    @GetMapping("/payment/hystrix/timeout")
    @HystrixCommand/*(fallbackMethod = "fallback",commandProperties = {
            @HystrixProperty(name="execution.isolation.thread.timeoutInMilliseconds",value="5000")
    })*/
    public String paymentHystrixTimeout(){
        //int a = 10 / 0;
        int time = 3000;
        return paymentService.paymentInfo_Timeout(time);
    }

    @HystrixCommand(fallbackMethod = "cirCuitBreakerHandler",commandProperties = {
            @HystrixProperty(name = "circuitBreaker.enabled",value = "true"),  //是否开启断路器
            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold",value = "10"),   //请求次数
            @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds",value = "10000"),  //时间范围
            @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage",value = "60"), //失败率达到多少后跳闸
    })
    @GetMapping("/payment/hystrix/circuitbreaker/{id}")
    public String cirCuitBreaker(@PathVariable("id") int id){
        return paymentService.cirCuitBreaker(id);
    }

    private String fallback(){
        return " fall back "+ IdUtil.simpleUUID();
    }

    private String globalFallBack(){
        return "global fall back "+ IdUtil.simpleUUID();
    }

    private String cirCuitBreakerHandler(int id){
        return " cirCuitBreaker handler .. ";
    }
}
