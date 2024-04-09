package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.beans.Owner;

public class PCNameSpaceTest {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader =null;
		Owner owner=null;
		
		factory=new DefaultListableBeanFactory();
		reader =new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		
		owner=factory.getBean("rajeshwar",Owner.class);
		System.out.println(owner);
		
	}

}
