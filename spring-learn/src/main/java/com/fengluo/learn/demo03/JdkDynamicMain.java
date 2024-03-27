package com.fengluo.learn.demo03;

import java.lang.reflect.Proxy;

/**
 * @Author: fengluo
 * @Date: 2024/3/27 21:31
 */
public class JdkDynamicMain {

	public static void main(String[] args) {
		JdkDynamicProxy01 jdkDynamicProxy01 = new JdkDynamicProxyImpl01();
		// 第一个参数:类加载器，为了将代理类的字节码加载到JVM中，生成class对象
		// 第二个参数:代理类要实现的接口列表
		// 第三个参数:具体的调用处理器，执行代理逻辑
		// JDK 动态代理是基于接口的
		Object obj1 = Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), new Class<?>[]{JdkDynamicProxy01.class, JdkDynamicProxy02.class}, new MyInvocationHandler(jdkDynamicProxy01));
		((JdkDynamicProxy01) obj1).hello01();
		((JdkDynamicProxy02) obj1).hello02();

	}

}
