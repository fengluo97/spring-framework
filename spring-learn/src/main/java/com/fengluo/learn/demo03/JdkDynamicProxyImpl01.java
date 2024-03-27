package com.fengluo.learn.demo03;

/**
 * @Author: fengluo
 * @Date: 2024/3/27 21:17
 */
public class JdkDynamicProxyImpl01 implements JdkDynamicProxy01, JdkDynamicProxy02{
    @Override
    public void hello01() {
        System.out.println("hello01");
    }

    @Override
    public void hello02() {
        System.out.println("hello02");
    }
}