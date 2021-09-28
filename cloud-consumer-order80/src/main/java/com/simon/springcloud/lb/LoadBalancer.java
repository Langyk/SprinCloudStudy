package com.simon.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @Author: Simon Lang
 * @Description: Think Twice, Code Once
 * @Date: 2021/9/28 22:39
 */
public interface LoadBalancer {
    ServiceInstance instances(List serviceInstances);
}
