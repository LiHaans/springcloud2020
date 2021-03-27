package com.sy.springcloud.controller;

import cn.hutool.core.util.IdUtil;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.sy.springcloud.service.PaymentFeignHystrixService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Auther: lihang
 * @Date: 2020-12-09 21:19
 * @Description:
 */
@RestController
@Slf4j
public class OrderFeignHystrixController {

    @Resource
    private PaymentFeignHystrixService paymentFeignHystrixService;

    @GetMapping("/consumer/payment/hystrix/ok")
    public String paymentHystrixOK(){
        log.info("80访问");
        return paymentFeignHystrixService.paymentHystrixOK();
    }

    /*@HystrixCommand(fallbackMethod = "fallBack",commandProperties = {
            @HystrixProperty(name="execution.isolation.thread.timeoutInMilliseconds",value="8000")
    })*/
    @GetMapping("/consumer/payment/hystrix/timeout")
    public String paymentHystrixTimeout(){
        log.info("80访问");
        return paymentFeignHystrixService.paymentHystrixTimeout();
    }

    private String fallBack(){
        return "Order fall back "+ IdUtil.simpleUUID();
    }
}
