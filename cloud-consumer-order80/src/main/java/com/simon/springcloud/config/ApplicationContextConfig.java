package com.simon.springcloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: Simon Lang
 * @Description: Think Twice, Code Once
 * @Date: 2021/9/14 23:20
 */
@Configuration
public class ApplicationContextConfig {
@Bean
public RestTemplate restTemplate(){
    return new RestTemplate();
}
}
