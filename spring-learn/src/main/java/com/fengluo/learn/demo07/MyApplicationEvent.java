package com.fengluo.learn.demo07;

import org.springframework.context.ApplicationEvent;

/**
 * @Author: fengluo
 * @Date: 2024/3/30 17:42
 */
public class MyApplicationEvent extends ApplicationEvent {

	private static final long serialVersionUID = -1L;

	/**
	 * Create a new {@code ApplicationEvent}.
	 *
	 * @param source the object on which the event initially occurred or with
	 *               which the event is associated (never {@code null})
	 */
	public MyApplicationEvent(Object source) {
		super(source);
	}
}
