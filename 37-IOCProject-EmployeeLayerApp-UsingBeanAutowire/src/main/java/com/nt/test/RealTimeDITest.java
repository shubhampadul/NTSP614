package com.nt.test;

import java.util.Scanner;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

import com.nt.controller.MainController;
import com.nt.vo.EmployeeVO;

public class RealTimeDITest {
	
	
	public static void main(String[] args) {
		MainController controller=null;
		Scanner sc=null;
		EmployeeVO vo=null;
		
		String empName=null;
		String empAddrs=null;
		String basicSal=null;
		BeanFactory factory=null;
		
		try {
		//create scanner obj
		sc=new Scanner(System.in);
		
		//read inputs from user
		
		System.out.println("enter Employee Name ::");
		empName=sc.nextLine();
		System.out.println("enter Employee Address ::");
		empAddrs=sc.nextLine();
		System.out.println("enter Employee Basic Salary ::");
		basicSal=sc.nextLine();
		
		//create EmployeeVO class obj having input values
		vo=new EmployeeVO();
		
		vo.setEmpName(empName);
		vo.setEmpAdrs(empAddrs);
		vo.setBasicSal(basicSal);
		
		//createIOC Container
		factory=new XmlBeanFactory(new FileSystemResource("src/main/java/com/nt/cfgs/applicationContext.xml"));
		
		controller=factory.getBean("controller",MainController.class);
		
		
			System.out.println(controller.processEmployee(vo));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
