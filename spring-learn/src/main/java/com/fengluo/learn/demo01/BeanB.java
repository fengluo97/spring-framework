package com.fengluo.learn.demo01;

import org.springframework.stereotype.Component;

/**
 * @Author: fengluo
 * @Date: 2024/3/24 14:21
 */
@Component
public class BeanB {

	public BeanB() {
		System.out.println("BeanB 的构造方法");
	}

	@Override
	public String toString() {
		return "BeanB{}";
	}
}
