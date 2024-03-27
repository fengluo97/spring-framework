package com.fengluo.learn.demo04;

import org.springframework.cglib.proxy.Enhancer;

/**
 * @Author: fengluo
 * @Date: 2024/3/27 22:46
 */
public class CglibProxyMain {

	public static void main(String[] args) {
		// cglib 基于继承的代理实现
		CglibProxyService target = new CglibProxyService();
		MyMethodInterceptor myMethodInterceptor = new MyMethodInterceptor(target);

		Enhancer enhancer = new Enhancer();
		// 设置父类
		enhancer.setSuperclass(CglibProxyService.class);
		// 设置方法拦截器回调
		enhancer.setCallback(myMethodInterceptor);
		// 使用 Enhancer 增强类创建代理对象
		CglibProxyService cglibProxyService = (CglibProxyService) enhancer.create();
		cglibProxyService.hello01();
	}

}
