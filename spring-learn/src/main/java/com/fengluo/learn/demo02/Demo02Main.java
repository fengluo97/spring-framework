package com.fengluo.learn.demo02;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: fengluo
 * @Date: 2024/3/26 21:44
 */
public class Demo02Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.fengluo.learn.demo02");

		IAopBean aopBean1 = (IAopBean) context.getBean("aopBean1");
		AopBean2 aopBean2 = (AopBean2) context.getBean("aopBean2");
		AopBean3 aopBean3 = (AopBean3) context.getBean("aopBean3");

		System.out.println("obj1:" + aopBean1.getClass());
		aopBean1.hello();

		System.out.println("-----------------------");
		System.out.println("obj2:" + aopBean2.getClass());
		aopBean2.hello();

		System.out.println("-----------------------");
		System.out.println("obj3:" + aopBean3.getClass());
		aopBean3.hello();

	}

}
