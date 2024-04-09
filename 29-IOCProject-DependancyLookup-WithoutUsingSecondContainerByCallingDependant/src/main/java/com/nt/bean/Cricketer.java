package com.nt.bean;
public class Cricketer {
	String beanId;
	
	public void setBeanId(String beanId) {
		this.beanId = beanId;
	}

	public Cricketer() {
		System.out.println("Cricketer.Cricketer()");
	}
	
	public void filding() {
		System.out.println("Cricketer filding");
	}
	public void bowling() {
		System.out.println("Cricketer bowling");
	}
	public void batting(Bat bat) {
		System.out.println("Cricketer.batting()");
		Bat                     bat1=bat;
        bat1.score();
	}
}