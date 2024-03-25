package com.fengluo.learn.demo01;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @Author: fengluo
 * @Date: 2024/3/24 14:21
 */
@Component
public class BeanB {

	@Resource
	private BeanA beanA;

	public BeanB() {
		System.out.println("BeanB 的构造方法");
	}

	@Override
	public String toString() {
		return "BeanB{}";
	}
}
