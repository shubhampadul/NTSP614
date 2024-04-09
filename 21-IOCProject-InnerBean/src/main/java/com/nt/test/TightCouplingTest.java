package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.nt.beans.Flipkart;

public class TightCouplingTest {
	public static void main(String[] args) {
	Resource res=null;
	BeanFactory factory=null;
	
	res=new ClassPathResource("com/nt/cfgs/applicationContext.xml");
	
	//create ioc containr
	factory=new XmlBeanFactory(res);
	
	Flipkart flipkart=factory.getBean("fk",Flipkart.class);
	
	System.out.println(flipkart.shopping(new String[] {"flag","sweets","kurta"}, new float[] {1000,2000,6000}));
	}
}
