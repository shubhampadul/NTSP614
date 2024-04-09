package com.nt.beans;

public class CNGEngine implements Engine{
	@Override
	public void start() {
		System.out.println("CNGEngine() started");
	}
	
	@Override
	public void stop() {
		System.out.println("CNGEngine.stop()");
	}
	
	

}
