package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.Courier;
import com.nt.beans.FlipKart;

public class AutowierdTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		FlipKart flipkart=null;
		//create ioc container
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		
		//get courier object
		flipkart=ctx.getBean("flipkart",FlipKart.class);
		
		System.out.println(flipkart);
		((AbstractApplicationContext) ctx).close();

	}

}
