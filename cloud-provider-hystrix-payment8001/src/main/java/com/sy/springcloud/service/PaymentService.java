package com.sy.springcloud.service;

import org.springframework.stereotype.Service;

/**
 * @Auther: lihang
 * @Date: 2020-12-09 20:16
 * @Description:
 */
public interface PaymentService {

    String paymentInfo_OK();

    String paymentInfo_Timeout(int time);

    String cirCuitBreaker(int id);
}
