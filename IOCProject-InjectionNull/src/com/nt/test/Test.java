package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.beans.InjectionNull;

public class Test {

	public static void main(String[] args) {
		//create IOC container
		DefaultListableBeanFactory  factory=new DefaultListableBeanFactory();
		
		XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
		
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		
		
		//get bean class object
		InjectionNull in =factory.getBean("user",InjectionNull.class);
		System.out.println(in);
	}
	
}
