package com.nt.test;

import java.util.Calendar;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

public class FactoryMethodBeanInstantion {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader    reader =null;
		Class                      c      =null;
		Calendar                   cal1   =null;
		String                     str1    =null,str2=null;
		
		//create IOC container
		factory=new DefaultListableBeanFactory();
		reader =new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		
		c=factory.getBean("cz",Class.class);
		System.out.println("c class name "+c.getClass()+" c class data " +c.toString());
		
		System.out.println("......................");
		cal1=factory.getBean("cal",Calendar.class);
		System.out.println("class name "+cal1.getClass()+" class data "+cal1.toString());
		
		System.out.println("......................");
		
		str1=factory.getBean("s2",String.class);
		System.out.println("class name= "+str1.getClass()+" class data= "+str1.toString());
		System.out.println("......................");
		
		str2=factory.getBean("s3",String.class);
		System.out.println("class name ="+str2.getClass()+" class data ="+str2.toString());
		
	}

}
