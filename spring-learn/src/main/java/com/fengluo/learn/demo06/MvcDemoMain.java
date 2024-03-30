package com.fengluo.learn.demo06;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleListener;
import org.apache.catalina.connector.Connector;
import org.apache.catalina.startup.Tomcat;

/**
 * @Author: fengluo
 * @Date: 2024/3/29 21:31
 */
public class MvcDemoMain {

	public static void main(String[] args) throws Exception {
		Tomcat tomcat = new Tomcat();

		Connector connector = new Connector();
		connector.setPort(8080);
		connector.setURIEncoding("UTF-8");
		tomcat.getService().addConnector(connector);

		Context context = tomcat.addContext("", System.getProperty("java.io.tmpdir"));
		LifecycleListener lifecycleListener = (LifecycleListener)
				Class.forName(tomcat.getHost().getConfigClass())
						.getDeclaredConstructor().newInstance();
		context.addLifecycleListener(lifecycleListener);
		tomcat.start();
		tomcat.getServer().await();
	}

}
