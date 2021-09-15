package com.simon.springcloud.controller;

import com.simon.springcloud.entites.CommonResult;
import com.simon.springcloud.entites.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: Simon Lang
 * @Description: Think Twice, Code Once
 * @Date: 2021/9/14 23:24
 */

@RestController
public class OrderController {

    public static final String PaymentSrv_URL = "http://localhost:8001";

    @Autowired
    private RestTemplate restTemplate;

    /**
     * url, requestMap, ResponseBean.class)这三个参数分别代表
     * REST请求地址、请求参数、HTTP响应转换被转换成的对象类型。
     */
    @GetMapping("/consumer/payment/create") //客户端用浏览器是get请求，但是底层实质发送post调用服务端8001
    public CommonResult create(@RequestBody Payment payment)
    {
        return restTemplate.postForObject(PaymentSrv_URL + "/payment/create",payment,CommonResult.class);
    }

    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult getPayment(@PathVariable Long id)
    {
        return restTemplate.getForObject(PaymentSrv_URL + "/payment/get/"+id, CommonResult.class, id);
    }

}
