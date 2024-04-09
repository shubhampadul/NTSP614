package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.beans.Person;
import com.nt.beans.Printer;

public class BeanScopeTest {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		Person                     p1  =null,p2=null;
		Printer                    pntr1=null,pntr2=null;
		
		
		//create IOC container
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		
		p1=factory.getBean("per",Person.class);
		p2=factory.getBean("per",Person.class);
		
		System.out.println(p1.hashCode()+" "+p2.hashCode());
		System.out.println(p1==p2);
		System.out.println(".........................");
		pntr1=factory.getBean("pntr",Printer.class);
		pntr2=factory.getBean("pntr",Printer.class);
		
		System.out.println(pntr1.hashCode()+" "+pntr2.hashCode());
		System.out.println(pntr1==pntr2);
		System.out.println(".........................");
	}

}
