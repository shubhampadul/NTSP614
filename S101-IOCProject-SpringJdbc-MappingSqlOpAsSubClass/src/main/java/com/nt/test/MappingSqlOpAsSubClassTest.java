package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.EmployeeMgnmtService;

public class MappingSqlOpAsSubClassTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		EmployeeMgnmtService empService;
		int no=0;
		//create ioc container
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
	
		empService=ctx.getBean("empService", EmployeeMgnmtService.class);
		no=7788;
		System.out.println(empService.fetchEmpById(no));
		
		//close ioc contaner
		((AbstractApplicationContext) ctx).close();
	}

}
