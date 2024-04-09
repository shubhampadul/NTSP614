
package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.bean.Bat;
import com.nt.bean.Cricketer;

public class LookupInjectionTest {
	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader    reader =null;
		Cricketer                  cricket=null;
		Bat                        bat    =null;
		//create IOC container 
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		
		cricket=factory.getBean("crick",Cricketer.class);
		bat=factory.getBean("bat",Bat.class);
		cricket.bowling();
		cricket.filding();
		cricket.batting(bat);
	}

}
