package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.VotingEligibilityCheck;

public class VotingElegibilityTest {
	public static void main(String[] args) {
	ApplicationContext ctx=null;
	VotingEligibilityCheck vec=null;
	
	//create IOC container
	ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
	//call getBean()
	vec=ctx.getBean("vec",VotingEligibilityCheck.class);
	System.out.println(vec.checkVotingValidity());
	System.out.println(vec);
	((AbstractApplicationContext) ctx).close();
	
	}
}