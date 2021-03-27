package com.sy.springcloud.service;

import com.sy.cloudapicommons.entity.CommonResult;
import com.sy.cloudapicommons.entity.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Auther: lihang
 * @Date: 2020-12-09 10:13
 * @Description:
 */
@Component
@FeignClient(value="CLOUD-PAYMENT-SERVICE")
public interface PaymentService {

    @GetMapping("/payment/get/{id}")
    CommonResult<Payment> getPaymentById(@PathVariable("id") Long id);

    @GetMapping("/payment/feign/timeout")
    String timeOut();
}
