package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.nt.beans.WishMessageGenerator;

public class SetterInjectionTest {
	
	public static void main(String[] args) {
		System.out.println("SetterInjectionTest Start of main()");
		
		Resource res=null;
		BeanFactory factory=null;
		
		//refer spring bean cfg file
		
		res=new FileSystemResource("src/com/nt/cfgs/applicationContext.xml");
		
		//create BeanFactory IOC container
		
		factory=new XmlBeanFactory(res);
		
		//get target spring bean class object
		
		WishMessageGenerator generator=(WishMessageGenerator)factory.getBean("wmg");
		
		//generate the result
		
		System.out.println("Result is :: "+generator.generateWishMessage("Rajeshwar"));
		/**/
		System.out.println("\nSetterInjectionTest End of main()");
		
	}//main
}//class
