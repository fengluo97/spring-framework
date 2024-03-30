package com.fengluo.learn.demo07;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: fengluo
 * @Date: 2024/3/30 17:43
 */
public class Demo07Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context
				= new AnnotationConfigApplicationContext("com.fengluo.learn.demo07");
		// 发布事件
		context.publishEvent(
				new MyApplicationEvent(Thread.currentThread().getName() + " | 自定义事件 ..."));
	}

}
