package com.simon.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


/**
 * @Author: Simon Lang
 * @Description: Think Twice, Code Once
 * @Date: 2021/9/25 19:38
 */
@SpringBootApplication
@EnableDiscoveryClient//该注解用于向使用consul或者zookeeper作为注册中心时注册服务
public class OrderZK80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderZK80.class,args);
    }
}
