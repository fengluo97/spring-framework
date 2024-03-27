package com.fengluo.learn.demo04;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Author: fengluo
 * @Date: 2024/3/27 22:44
 */
public class MyMethodInterceptor implements MethodInterceptor {

	private Object target;

	public MyMethodInterceptor(Object target) {
		this.target = target;
	}

	@Override
	public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
		System.out.println("before execute..." + method.getName());
		method.invoke(target, objects);
		System.out.println("after execute..." + method.getName());
		return null;
	}
}
