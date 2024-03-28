package com.fengluo.learn.demo05;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: fengluo
 * @Date: 2024/3/28 23:29
 */
public class TransactionMain {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext
				= new AnnotationConfigApplicationContext("com.fengluo.learn.demo05");
		UserService userService = applicationContext.getBean(UserService.class);
		userService.insert();

	}

}
