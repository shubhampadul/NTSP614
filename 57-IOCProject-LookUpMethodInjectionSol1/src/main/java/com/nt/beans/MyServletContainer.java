package com.nt.beans;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class MyServletContainer implements ApplicationContextAware{
	private ApplicationContext ctx;
	private String    beanid;
	
	public MyServletContainer(String beanid) {
		System.out.println("MyServletContainer.1 param constructor");
		this.beanid = beanid;
	}

	public void setApplicationContext(ApplicationContext ctx) throws BeansException {
		this.ctx=ctx;
	}
	
	public MyServletContainer() {
	System.out.println("MyServletContainer.0 param constructor");
		
	}
	public void handleRequest(String data) {
		System.out.println("MyServletContainer.handleRequest()");
		RequestHandler handler;
		handler=ctx.getBean(beanid,RequestHandler.class);
		handler.processHandle(data);
	}
	
}