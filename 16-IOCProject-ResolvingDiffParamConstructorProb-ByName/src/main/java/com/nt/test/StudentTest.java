package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.beans.StudentMarks;

public class StudentTest {
	
	
	public static void main(String[] args) {
		
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader    reader =null;
		StudentMarks               sm=null;
		
		//create IOC container
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		
		//create studentMarks clas obj
		sm=factory.getBean("st",StudentMarks.class);
		
		System.out.println(sm);
	}
	 

}
