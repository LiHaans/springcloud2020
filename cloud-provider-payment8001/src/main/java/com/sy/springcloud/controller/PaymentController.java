package com.sy.springcloud.controller;

import com.sy.springcloud.entity.CommonResult;
import com.sy.springcloud.entity.Payment;
import com.sy.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author:lihang
 * @create:2020-08-23 14:49
 */
@RestController
@Slf4j
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @PostMapping("payment/create")
    public CommonResult create(@RequestBody Payment payment){
        log.info("ID:"+payment.getId()+"");
        log.info("SERIAL:"+payment.getSerial());
        int i = paymentService.create(payment);
        if( i>0 ){
            return new CommonResult(200,"success",i);
        }else {
            return new CommonResult(444,"fail");
        }

    }

    @GetMapping("payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id){

        Payment payment = paymentService.getPaymentById(id);
        if(payment!=null){
            return new CommonResult(200,"success",payment);
        }else {
            return new CommonResult(444,"没有对应的数据-"+id);
        }


    }
}
