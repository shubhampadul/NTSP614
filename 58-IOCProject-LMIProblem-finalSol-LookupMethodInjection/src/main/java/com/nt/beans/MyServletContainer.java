package com.nt.beans;

public abstract class MyServletContainer {
	public MyServletContainer() {
		System.out.println("MyServletContainer.MyServletContainer()");
	}

	public void handleRequest(String data) {
		System.out.println("MyServletContainer.handleRequest()");
		RequestHandler handler = getRequestHandler();
		handler.processHandle(data);
	}

	public abstract RequestHandler getRequestHandler();
}