package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.beans.Tournament;

public class BeanWiringTest {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		Tournament              trnmt =null;
				
		//cerate IOC container
		factory=new DefaultListableBeanFactory();
		reader =new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		
		trnmt=factory.getBean("trnmt",Tournament.class);
		System.out.println(trnmt);
	}
}
