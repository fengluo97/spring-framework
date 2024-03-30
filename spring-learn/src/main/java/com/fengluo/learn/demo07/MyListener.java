package com.fengluo.learn.demo07;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @Author: fengluo
 * @Date: 2024/3/30 17:43
 */
@Component
public class MyListener implements ApplicationListener<MyApplicationEvent> {
	@Override
	public void onApplicationEvent(MyApplicationEvent event) {
		System.out.println(Thread.currentThread().getName() + " | " + event.getSource());
	}
}
