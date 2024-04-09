package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;

import com.nt.service.EmployeeService;

public class NamedParameterJdbcTemplateTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		EmployeeService empService=null;
		
		//create ioc container
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		
		
		empService=ctx.getBean("empService",EmployeeService.class);
		
		try {
		//get emp record
		System.out.println(empService.fetchEmpById(7788));
		}
		catch(DataAccessException dae) {
			dae.printStackTrace();
		}
	}

}
