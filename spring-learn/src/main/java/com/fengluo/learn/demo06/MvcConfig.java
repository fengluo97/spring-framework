package com.fengluo.learn.demo06;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @Author: fengluo
 * @Date: 2024/3/29 21:14
 */
@Component
@ComponentScan("com.fengluo.learn.demo06")
@EnableWebMvc
public class MvcConfig {
}
