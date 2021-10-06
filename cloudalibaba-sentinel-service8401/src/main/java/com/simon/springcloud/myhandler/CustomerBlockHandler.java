package com.simon.springcloud.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.simon.springcloud.entities.CommonResult;

/**
 * @Author: Simon Lang
 * @Description: Think Twice, Code Once
 * @Date: 2021/10/6 11:13
 */
public class CustomerBlockHandler {
    public static CommonResult handleException(BlockException exception) {
        {
            return new CommonResult(4444, "按客戶自定义,global handlerException----1");
        }
    }
        public static CommonResult handlerException2(BlockException exception)
        {
            return new CommonResult(4444,"按客戶自定义,global handlerException----2");
        }

}
