package com.nt.test;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Import;

import com.nt.config.AppConfig;
import com.nt.controller.MainController;
import com.nt.vo.EmployeeVO;

@SpringBootApplication
@Import(AppConfig.class)
public class RealTimeDITest {

	public static void main(String[] args) {
		MainController controller = null;
		Scanner sc = null;
		EmployeeVO vo = null;

		String empName = null;
		String empAddrs = null;
		String basicSal = null;
		ApplicationContext ctx = null;

		try {
			// create scanner obj
			sc = new Scanner(System.in);

			// read inputs from user
			System.out.println("enter Employee Name ::");
			empName = sc.nextLine();
			System.out.println("enter Employee Address ::");
			empAddrs = sc.nextLine();
			System.out.println("enter Employee Basic Salary ::");
			basicSal = sc.nextLine();

			// create EmployeeVO class obj having input values
			vo = new EmployeeVO();
			vo.setEmpName(empName);
			vo.setEmpAdrs(empAddrs);
			vo.setBasicSal(basicSal);

			// get ioc container
			ctx=SpringApplication.run(RealTimeDITest.class, args);
			System.out.println(ctx);
			
			controller = ctx.getBean("controller", MainController.class);
			System.out.println(controller.processEmployee(vo));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}