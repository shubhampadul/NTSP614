package com.nt.test;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.controller.StudentController;
import com.nt.vo.StudentVo;

public class ClientAppByApplicationContext {

	public static void main(String[] args)throws Exception{
		ApplicationContext ctx   =null;
		StudentController controller=null;
		Scanner           sc        =null;
		
		String            sname     =null;
		String            saddrs    =null;
		String            m1        =null;
     	String            m2        =null;
		String            m3        =null;
		
		//create scanner obj
		sc= new Scanner(System.in);
		
		//create IOC container
	    ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		
		//get bean
		controller=ctx.getBean("stController",StudentController.class);
		
		//read inputs
		System.out.println("Enter Student Name:");
		sname=sc.next();
		System.out.println("Enter Student Address:");
		saddrs=sc.next();
		System.out.println("Enter Student Marks1:");
		m1=sc.next();
		System.out.println("Enter Student Marks2:");
		m2=sc.next();
		System.out.println("Enter Student Marks3:");
		m3=sc.next();
		
		//call method
		StudentVo vo=new StudentVo();
		
		vo.setSname(sname);
		vo.setSaddrs(saddrs);
		vo.setM1(m1);
		vo.setM2(m2);
		vo.setM3(m3);
		try {
		System.out.println(controller.process(vo));
		}
		catch(Exception se){
			se.printStackTrace();
		}
		sc.close();
		//close the ioc container
		((AbstractApplicationContext) ctx).close();
	}
}