package com.sy.springcloud.dao;

import com.sy.springcloud.entity.Payment;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author:lihang
 * @create:2020-08-23 14:25
 */
@Mapper
public interface PaymentDao {
    public int create(Payment payment);

    public Payment getPaymentById(Long id);

}
