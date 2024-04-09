package com.nt.beans;

public class RequestHandler {
	public static int count;
	public int reqCount;
	
	public RequestHandler() {
		count++;
		System.out.println("RequestHandler.0 param constructor");
		
	}
	
	public void processHandle(String data) {
		//reqCount++;
		System.out.println("Handling Request "+count+" with data "+data);
	}
}