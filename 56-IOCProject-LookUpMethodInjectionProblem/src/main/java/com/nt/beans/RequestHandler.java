package com.nt.beans;

public class RequestHandler {
	public static int count;
	
	
	public RequestHandler() {
		System.out.println("RequestHandler.0 param constructor");
		count++;
	}
	
	public void processHandle(String data) {
		
		System.out.println("RequestHandler obj created  "+count+" times with data "+data);		
	}
}