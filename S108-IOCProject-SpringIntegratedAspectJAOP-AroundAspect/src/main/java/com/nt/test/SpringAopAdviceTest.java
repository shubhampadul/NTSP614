package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.nt.service.BankServiceImpl;

public class SpringAopAdviceTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		BankServiceImpl bankService=null;
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		
		bankService=ctx.getBean("bankService",BankServiceImpl.class);
		System.out.println(bankService.calcSimpleInterestAmmount(100000, 2, 10));
		System.out.println("...............................");
		System.out.println(bankService.calcSimpleInterestAmmount(100000, 2, 10));
		System.out.println("...............................");
		
		System.out.println(bankService.calcCompundInterestAmmount(100000, 2, 12));
	
		System.out.println(bankService.getClass().getSuperclass());
		//close ioc container
		((AbstractApplicationContext) ctx).close();
	}
}
