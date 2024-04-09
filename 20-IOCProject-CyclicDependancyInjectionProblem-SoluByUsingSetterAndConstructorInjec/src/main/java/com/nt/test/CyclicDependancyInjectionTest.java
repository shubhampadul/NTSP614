package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.beans.A;
import com.nt.beans.B;

public class CyclicDependancyInjectionTest {
	
	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader    reader =null;
		A                          a      =null;
		B                          b      =null;
		//create IOC container
		factory= new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		
		//call getBean()
		a=factory.getBean("a1",A.class);
		System.out.println(a);
		
		System.out.println("...............");

		b=factory.getBean("b1",B.class);
		System.out.println(b);	
		
	}
}