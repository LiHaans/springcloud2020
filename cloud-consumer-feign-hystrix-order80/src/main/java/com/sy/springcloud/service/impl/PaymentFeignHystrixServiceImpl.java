package com.sy.springcloud.service.impl;

import com.sy.springcloud.service.PaymentFeignHystrixService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @Auther: lihang
 * @Date: 2020-12-09 22:29
 * @Description:
 */
@Component
@Slf4j
public class PaymentFeignHystrixServiceImpl implements PaymentFeignHystrixService {

    @Override
    public String paymentHystrixOK() {
        log.info("80降级");
        return "PaymentFeignHystrixServiceImpl fall backTimeOut , (┬＿┬)";
    }

    @Override
    public String paymentHystrixTimeout() {
        log.info("80访问");
        return "PaymentFeignHystrixServiceImpl fall backTimeOut , (┬＿┬)";
    }
}
