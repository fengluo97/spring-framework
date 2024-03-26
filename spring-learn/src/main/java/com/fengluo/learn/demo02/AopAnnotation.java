package com.fengluo.learn.demo02;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.lang.annotation.*;

/**
 * @Author: fengluo
 * @Date: 2024/3/26 20:33
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface AopAnnotation {



}
