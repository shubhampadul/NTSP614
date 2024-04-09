package com.nt.test;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Date;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.demo.Demo;

public class DemoTest {
	public static void main(String[] args) throws Exception, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		BeanFactory factory=null;
		Demo demo=null;
		
		//create IOC container
		factory=new XmlBeanFactory(new FileSystemResource("src/com/nt/cfgs/applicationContext.xml"));
		//call getBean() method
		demo=(Demo)factory.getBean("dd");
		System.out.println(demo.toString());
	}
}
