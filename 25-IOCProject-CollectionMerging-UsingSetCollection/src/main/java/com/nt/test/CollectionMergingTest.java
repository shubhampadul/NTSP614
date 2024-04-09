package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.beans.EnggCources;

public class CollectionMergingTest {
	public static void main(String[] args) {
		
	
	DefaultListableBeanFactory factory=null;
	XmlBeanDefinitionReader reader=null;
	EnggCources course=null;
	
	//create IOC container
	factory=new DefaultListableBeanFactory();
	reader=new XmlBeanDefinitionReader(factory);
	reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
	
	course=factory.getBean("CompScience",EnggCources.class);
	System.out.println(course);
	}
}
