package com.fengluo.learn.demo01;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: fengluo
 * @Date: 2024/3/24 14:22
 */
public class Demo01Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.fengluo.learn.demo01");
		Object beanA = context.getBean("beanA");
		Object beanB = context.getBean("beanB");
		System.out.println(beanA.toString());
		System.out.println(beanB.toString());
	}

}
