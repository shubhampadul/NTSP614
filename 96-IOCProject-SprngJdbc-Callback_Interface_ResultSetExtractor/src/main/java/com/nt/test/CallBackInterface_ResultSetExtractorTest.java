package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.EmployeeMngmtService;

public class CallBackInterface_ResultSetExtractorTest {

	public static void main(String[] args) {
		ApplicationContext ctx = null;
		
		EmployeeMngmtService empService = null;
		
		// create ioc container
		ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");

		// get employeeService object
		empService = ctx.getBean("empService", EmployeeMngmtService.class);

		System.out.println(empService.fetchEmpByNo(7788));
		
		System.out.println(empService.fetchEmpsByDesg("CLERK","MANAGER","SALESMAN"));
		
		// close ioc container
		((AbstractApplicationContext) ctx).close();
	}
}