package com.simon.springcloud.service.impl;

import com.simon.springcloud.service.IMessageProvider;
import org.springframework.boot.context.properties.PropertyMapper;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * @Author: Simon Lang
 * @Description: Think Twice, Code Once
 * @Date: 2021/10/3 23:50
 */
@EnableBinding(Source.class) // 可以理解为是一个消息的发送管道的定义
public class MessageProviderImpl implements IMessageProvider {
    @Resource
    private MessageChannel output; // 消息的发送管道

    @Override
    public String send()
    {
        String serial = UUID.randomUUID().toString();
        this.output.send(MessageBuilder.withPayload(serial).build()); // 创建并发送消息
        System.out.println("***serial: "+serial);

        return serial;
    }
}
