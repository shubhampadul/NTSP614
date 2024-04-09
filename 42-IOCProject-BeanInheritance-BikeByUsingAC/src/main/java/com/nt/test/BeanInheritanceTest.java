package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.Bike;

public class BeanInheritanceTest {
	public static void main(String[] args) {
		ApplicationContext ctx=null;
		Bike                       bike1 =null,bike2 =null;
		
		//create ioc container 
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		
		//get Bike object
		bike1=ctx.getBean("bike1",Bike.class);
		System.out.println(bike1);
		System.out.println(".................");
		bike2=ctx.getBean("bike2",Bike.class);
		System.out.println(bike2);
		((AbstractApplicationContext) ctx).close();
	}

}
