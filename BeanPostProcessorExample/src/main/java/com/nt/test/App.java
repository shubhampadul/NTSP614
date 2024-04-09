package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.Employee;
import com.nt.dto.EmployeeDTO;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext ctx = null;

		Employee emp = null;

		ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		emp = ctx.getBean("emp", Employee.class);
		EmployeeDTO dto=ctx.getBean(EmployeeDTO.class);
		dto.setFirstName("Rajeshwar");
		dto.setLastName("Godwe");
		dto.setId(22);
		
		emp.empReg(dto);
		((AbstractApplicationContext) ctx).close();
	}
}
