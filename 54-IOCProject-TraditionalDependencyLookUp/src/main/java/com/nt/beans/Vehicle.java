package com.nt.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Vehicle {
	String beanid;
	public Vehicle(String beanid) {
		System.out.println("Vehicle.Vehicle()");
		this.beanid = beanid;
	}
	public void entertaintment() {
		System.out.println("Vehicle.entertaintment() playing some audios");
	}
	public void showHorn() {
		System.out.println("Vehicle.showHorn() horn on");
	}
	public void journey(String source,String dest) {
		ApplicationContext ctx=null;
		Engine             engg=null;
	
		//create ioc container
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		engg=ctx.getBean(beanid,Engine.class);
		engg.start();
		System.out.println("journey started from "+source+" to "+dest);
		
		((AbstractApplicationContext) ctx).close();
		engg.end();
		System.out.println("journey ended");
	}
}