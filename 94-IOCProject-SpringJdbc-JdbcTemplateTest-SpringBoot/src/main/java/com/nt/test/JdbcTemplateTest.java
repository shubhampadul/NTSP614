package com.nt.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Import;

import com.nt.config.AppConfig;
import com.nt.service.EmployeeService;
import com.nt.service.EmployeeServiceImpl;

@SpringBootApplication
@Import(AppConfig.class)
public class JdbcTemplateTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		EmployeeService empService=null;
		//get ioc container
		ctx=SpringApplication.run(JdbcTemplateTest.class, args);
		
		
		//get Service object
		empService=ctx.getBean("empService",EmployeeServiceImpl.class);
	
		//get total emp count
				System.out.println("total Employee Count: " + empService.getEmpsTotal());
				//get emp details by no
				System.out.println("7788 emp details " + empService.fetchEmpByNo(7788));
				//get emp details by desg
				System.out.println("all CLERK details "+empService.fetchEmpByDesg("CLERK"));
				//get emp name by id
				System.out.println("7788 empno emp name ::"+empService.fetchEmpNameByNo(7788));
				//get emp sal
				System.out.println("7788 empno emp sal ::"+empService.fetchEmpSalByNo(7788));
				//insert new emp record
				//System.out.println("New Registration ::" +empService.registerEmp("rajeshwar", "developer", 2000));
				
				//delete emp record
				System.out.println(empService.removeEmp(197));
				
				//update emp sal by %
				//System.out.println("Updated sal ::"+empService.hikeEmpSal(7788, 10));

	}

}
