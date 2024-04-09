package com.nt.beans;

import org.springframework.beans.factory.annotation.Required;


public class Vehicle {	
	private int vid;
	private String model;
	private Engine engine;
	
	@Required
	public void setVid(int vid) {
		this.vid = vid;
	}
	public void setModel(String model) {
		this.model = model;
	}
	@Required
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	@Override
	public String toString() {
		return "Vehicle [vid=" + vid + ", model=" + model + ", engine=" + engine + "]";
	}
	
}