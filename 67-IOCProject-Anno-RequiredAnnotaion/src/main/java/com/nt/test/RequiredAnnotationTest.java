package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.Vehicle;

public class RequiredAnnotationTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		Vehicle vehicle =null;
		
		//create ioc container
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		vehicle=ctx.getBean("vehicle",Vehicle.class);
		
		System.out.println(vehicle);
		//close ioc container
		((AbstractApplicationContext) ctx).close();
	}
}