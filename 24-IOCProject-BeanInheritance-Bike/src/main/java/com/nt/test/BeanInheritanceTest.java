package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.Resource;

import com.nt.beans.Bike;

public class BeanInheritanceTest {
	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader    reader=null;
		Bike                       bike1 =null,bike2 =null;
		
		//create ioc container 
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		
		//get Bike object
		bike1=factory.getBean("bike1",Bike.class);
		System.out.println(bike1);
		System.out.println(".................");
		bike2=factory.getBean("bike2",Bike.class);
		System.out.println(bike2);
	}

}
