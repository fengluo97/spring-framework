package com.fengluo.learn.demo02;

import org.springframework.stereotype.Component;

/**
 * @Author: fengluo
 * @Date: 2024/3/26 20:33
 */
@Component
public class AopBean2 {

    @AopAnnotation
    public void hello() {
        System.out.println("未实现接口IAopService的hello()");
    }

}
