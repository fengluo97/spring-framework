package com.fengluo.learn.demo03;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Author: fengluo
 * @Date: 2024/3/27 21:17
 */
public class MyInvocationHandler implements InvocationHandler {

	private Object target;

	public MyInvocationHandler(Object target) {
		this.target = target;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("before execute..." + method.getName());
		Object res = method.invoke(target, args);
		System.out.println("after execute..." + method.getName());
		return res;
	}

}
