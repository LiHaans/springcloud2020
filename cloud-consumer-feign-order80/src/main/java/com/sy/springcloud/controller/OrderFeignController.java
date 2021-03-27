package com.sy.springcloud.controller;

import com.sy.cloudapicommons.entity.CommonResult;
import com.sy.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


/**
 * @Auther: lihang
 * @Date: 2020-12-09 10:11
 * @Description:
 */
@RestController
@Slf4j
public class OrderFeignController {

    @Resource
    private PaymentService paymentService;

    @GetMapping(value="/consumer/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id){
        return paymentService.getPaymentById(id);
    }

    @GetMapping(value = "/consumer/payment/timeout")
    public String timeOut(){
        return paymentService.timeOut();
    }
}
