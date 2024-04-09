package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.BankService;

public class MethodInjectionTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		BankService bank=null;
		//IOC container
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		bank=ctx.getBean("bank",BankService.class);
		System.out.println(bank.calcInterAmt(2000, 2,12));
		((AbstractApplicationContext) ctx).close();
	}
}