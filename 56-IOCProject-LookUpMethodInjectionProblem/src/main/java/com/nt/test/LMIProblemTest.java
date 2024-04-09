package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.MyServletContainer;

public class LMIProblemTest {
	public static void main(String[] args) {
		ApplicationContext ctx = null;
		MyServletContainer container = null;
		// Create IOC container
		ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");

		// call getBean() and get container object
		container = ctx.getBean("container", MyServletContainer.class);

		// call handleRequest() method
		container.handleRequest("Hello");

		container.handleRequest("Hi");

		
	}
}