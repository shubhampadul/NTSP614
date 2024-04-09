package com.nt.bean;

import java.util.Random;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

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
	public void batting(BeanFactory factory) {
		System.out.println("Cricketer.batting()");
		Bat                     bat=null;
        bat=factory.getBean(beanId,Bat.class);
        bat.score();
	}
}