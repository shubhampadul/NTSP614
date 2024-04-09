package com.nt.bean;

import java.util.Random;

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
	
	public void playing() {
		System.out.println("Cricketer Playing");
	}
	public void bowling() {
		System.out.println("Cricketer bowling");
	}
	public void batting() {
		System.out.println("Cricketer.batting()");
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		Bat                     bat=null;
		//create ioc container
        factory=new DefaultListableBeanFactory();
        reader=new XmlBeanDefinitionReader(factory);
        
        reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
       
        bat=factory.getBean(beanId,Bat.class);
        bat.score();
	}
}