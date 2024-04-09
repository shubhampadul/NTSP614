package com.nt.test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.Vehicle;

public class TraditionalDependencyLookUpTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		DefaultListableBeanFactory factory;

		 Vehicle       vehicle=null;
		//Create IOC container
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		vehicle=ctx.getBean("vehicle",Vehicle.class);
		vehicle.journey("hyd", "Aurangabad");		
		
		((AbstractApplicationContext) ctx).close();
	}

}
