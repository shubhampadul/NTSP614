package com.nt.beans;

public class MyServletContainer {
	private RequestHandler handler;
	
	public MyServletContainer(RequestHandler handler) {
	System.out.println("MyServletContainer one param constructor");
		this.handler = handler;
	}
	
	public void handleRequest(String data) {
		System.out.println("MyServletContainer.handleRequest()");
		handler.processHandle(data);
	}
}
