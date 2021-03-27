package com.sy.springcloud.service;

import com.sy.cloudapicommons.entity.Payment;

/**
 * @author:lihang
 * @create:2020-08-23 14:38
 */
public interface PaymentService {
    public int create(Payment payment);

    public Payment getPaymentById(Long id);
}
