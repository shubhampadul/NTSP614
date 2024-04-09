package com.nt.beans;

public final class Vehicle {
	Engine engine;
	
	public Vehicle(Engine engine) {
		this.engine = engine;
	}
	
	public void journey(String source,String dest) {
		engine.start();
		System.out.println("Vehicle is started from "+source);
		System.out.println("Vehicle is going on ... from "+source+" to "+dest);
		engine.stop();
		System.out.println("Vehicle is stoped at "+ dest);
	}
	
	

}
