package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.BankService;

public class SpringAopAdviceTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		BankService bankService=null;
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		bankService=ctx.getBean("pfb",BankService.class);
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
