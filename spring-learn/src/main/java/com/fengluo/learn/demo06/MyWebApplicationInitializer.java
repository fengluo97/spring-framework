package com.fengluo.learn.demo06;

import org.springframework.core.MethodParameter;
import org.springframework.http.HttpInputMessage;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.lang.NonNull;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.mvc.method.annotation.RequestBodyAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
import java.io.IOException;
import java.lang.reflect.Type;

/**
 * @Author: fengluo
 * @Date: 2024/3/29 21:19
 */
public class MyWebApplicationInitializer implements WebApplicationInitializer {
	@Override
	public void onStartup(@NonNull ServletContext servletContext) throws ServletException {
		AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
		context.register(MvcConfig.class);

		// 将 context 放入 DispatcherServlet，在 DispatcherServlet init 时会进行 refresh
		DispatcherServlet dispatcherServlet = new DispatcherServlet(context);
		// 将 DispatcherServlet 注册到 Servlet 容器中，从而使得分发处理器可以接收http请求
		ServletRegistration.Dynamic app = servletContext.addServlet("app", dispatcherServlet);
		app.setLoadOnStartup(1);
		app.addMapping("/*");
	}

}
