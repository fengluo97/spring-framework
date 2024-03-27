package com.fengluo.learn.demo02;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
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
	private Object around(ProceedingJoinPoint pjp) {
		System.out.println("@Around before...");
		Object result = null;
		try {
			result = pjp.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		System.out.println("@Around after...");
		return result;
	}

	@Before("pointcut()")
	private void before(JoinPoint pjp) {
		System.out.println("@Before 的 before...");
	}

	@After("pointcut()")
	private void after(JoinPoint pjp) {
		System.out.println("@After 的 before...");
	}

	@AfterReturning("pointcut()")
	private void afterReturning(JoinPoint pjp) {
		System.out.println("@AfterReturning 的 before...");
	}

	@AfterThrowing("pointcut()")
	private void afterThrowing(JoinPoint pjp) {
		System.out.println("@AfterThrowing 的 before...");
	}

}
