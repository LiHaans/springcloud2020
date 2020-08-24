package com.sy.springcloud.service.impl;

import com.sy.springcloud.dao.PaymentDao;
import com.sy.springcloud.entity.Payment;
import com.sy.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author:lihang
 * @create:2020-08-23 14:41
 */
@Service("PaymentService")
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        if(payment==null||payment.getSerial()==null) {
            return 0;
        }
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        Payment payment = paymentDao.getPaymentById(id);
        return payment;
    }
}
