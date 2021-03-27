package com.sy.springcloud.service;

import cn.hutool.core.util.IdUtil;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.sy.springcloud.service.impl.PaymentFeignHystrixServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Auther: lihang
 * @Date: 2020-12-09 21:17
 * @Description:
 */
@Component
@FeignClient(value = "PROVIDER-HYSTRIX-PAYMENT8001",fallback = PaymentFeignHystrixServiceImpl.class)
public interface PaymentFeignHystrixService {

    @GetMapping("/payment/hystrix/ok")
    String paymentHystrixOK();


    @GetMapping("/payment/hystrix/timeout")
    String paymentHystrixTimeout();


}
