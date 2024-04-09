package com.nt.beans;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Vehicle implements ApplicationContextAware{
	ApplicationContext ctx=null;
	String beanid;
	public Vehicle(String beanid) {
		System.out.println("Vehicle.Vehicle()");
		this.beanid = beanid;
	}
	
	public void setApplicationContext(ApplicationContext ctx) throws BeansException {
		this.ctx=ctx;
	}
	public void entertaintment() {
		System.out.println("Vehicle.entertaintment() playing some audios");
	}
	
	public void showHorn() {
		System.out.println("Vehicle.showHorn() horn on");
	}
	
	public void journey(String source,String dest) {
		Engine             engg=null;
    	
		engg=ctx.getBean(beanid,Engine.class);
		engg.start();
		System.out.println("journey started from "+source+" to "+dest);
		((AbstractApplicationContext) ctx).close();
		engg.end();
		System.out.println("journey ended");
	}
}