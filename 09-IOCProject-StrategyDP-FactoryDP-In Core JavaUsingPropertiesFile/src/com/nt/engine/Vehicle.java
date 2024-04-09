package com.nt.engine;

//target class
public class Vehicle {
	Engine engine=null;
	
	public Vehicle(Engine engine){
		this.engine=engine;
	}
	
	public void journey(String source,String dest) {
		engine.start();
		System.out.println("journey started from "+source);
		System.out.println("journey is going on ..."+source+" to "+dest);
		engine.stop();
		System.out.println("journey stop at "+dest);
	}

}
