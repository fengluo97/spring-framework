package com.fengluo.learn.demo02;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * 切面
 * @Author: fengluo
 * @Date: 2024/3/26 20:34
 */
@Aspect
@Component
public class AopAspectj {

	// 切点
	@Pointcut("@annotation(com.fengluo.learn.demo02.AopAnnotation)")
	public void pointcut() {
	}

	@Around("pointcut()")
	public Object around(ProceedingJoinPoint pjp) {
		System.out.println("before...");
		Object result = null;
		try {
			result = pjp.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		System.out.println("after...");
		return result;
	}

}
