package com.simon.springcloud.service;

import com.simon.springcloud.entities.CommonResult;
import com.simon.springcloud.entities.Payment;
import org.springframework.stereotype.Component;

/**
 * @Author: Simon Lang
 * @Description: Think Twice, Code Once
 * @Date: 2021/10/6 12:11
 */
@Component
public class PaymentFallbackService implements PaymentService
{
    @Override
    public CommonResult<Payment> paymentSQL(Long id)
    {
        return new CommonResult<>(44444,"服务降级返回,---PaymentFallbackService",new Payment(id,"errorSerial"));
    }
}