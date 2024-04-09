package com.nt.beans;

public class RequestHandler {
	public static int count;
	
	
	public RequestHandler() {
		count++;
		System.out.println("RequestHandler.0 param constructor");
		
	}
	public void processHandle(String data) {
		System.out.println("RequestHandler.processHandle() "+count+" with data "+data);
	}
}