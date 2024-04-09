package com.nt.test;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;

import com.nt.dto.LoginUserDto;
import com.nt.service.LoginUserMngmtService;


public class LoginUser_SimpleJdbcCallTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		LoginUserMngmtService loginService=null;
		LoginUserDto dto=null;
		String uname=null,pass=null;
		Scanner sc=null;
		sc=new Scanner(System.in);
		//create ioc container
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		
		//get service object
		loginService=ctx.getBean("loginService",LoginUserMngmtService.class);
		
		dto=new LoginUserDto();
		//read inputs
		System.out.print("username::");
		uname=sc.next();
		System.out.print("password::");
		pass=sc.next();
		dto.setUname(uname);
		dto.setPwd(pass);
		
		try {
		System.out.println(loginService.validateUser(dto));
		}//try
		catch(DataAccessException dae) {
			dae.printStackTrace();
		}//catch
		
		
		//close ioc container
		((AbstractApplicationContext) ctx).close();
	}
}