package com.simon.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Author: Simon Lang
 * @Description: Think Twice, Code Once
 * @Date: 2021/9/28 22:40
 */
@Component
public class MyLB implements LoadBalancer{
    private AtomicInteger atomicInteger= new AtomicInteger(0);

    public final int getAndIncrement(){
        int current;
        int next;
        do{
            current = this.atomicInteger.get();
            next = current >= 2147483647 ? 0 : current + 1;
        }while (!this.atomicInteger.compareAndSet(current,next));
        System.out.println("******** next:"+next);
        return next;
    }

    @Override
    public ServiceInstance instances(List serviceInstances) {
        int index = getAndIncrement() % serviceInstances.size();
        return (ServiceInstance) serviceInstances.get(index);
    }
}
