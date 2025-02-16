package com.fengluo.learn.demo01;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author: fengluo
 * @Date: 2024/3/24 14:21
 */
@Service
public class BeanA {

	@Resource
	private BeanB beanB;

	public BeanA() {
		System.out.println("BeanA 的构造方法");
	}

	@Override
	public String toString() {
		return "BeanA{}";
	}
}
