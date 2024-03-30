package com.fengluo.learn.demo06;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: fengluo
 * @Date: 2024/3/29 21:28
 */
@RestController
@RequestMapping("/test")
public class TestController {

	@RequestMapping("/hello")
	public String hello() {
		System.out.println("hello!");
		return "hello world!";
	}

}
