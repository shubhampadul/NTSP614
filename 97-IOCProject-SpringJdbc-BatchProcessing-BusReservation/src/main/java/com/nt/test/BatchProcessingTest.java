package com.nt.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;

import com.nt.dto.PassangerResDto;
import com.nt.service.PassangerMngntService;

public class BatchProcessingTest {

	public static void main(String[] args) {
		Scanner sc=null;
		ApplicationContext ctx=null;
		PassangerMngntService passService=null;
		List<PassangerResDto> listDto=null;
		listDto=new ArrayList<PassangerResDto>();
		PassangerResDto dto=null;
		sc=new Scanner(System.in);
		int groupSize,fare;
		
		String source=null,dest=null,name=null;
		
		//create ioc container
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		
		//call service class method
		passService=ctx.getBean("passService",PassangerMngntService.class);
		
		//read inputs
		System.out.println("enter group size");
		groupSize=sc.nextInt();
		
		System.out.println("enter source");
		source=sc.next();
		
		System.out.println("enter destination");
		dest=sc.next();
		System.out.println("enter fare");
		fare=sc.nextInt();
		
		for(int i=1;i<=groupSize;i++) {
			dto=new PassangerResDto();
		    System.out.println("enter "+i+" passanger name");	
		    name=sc.next();
		    dto.setPname(name);
		    dto.setSource(source);
		    dto.setDest(dest);
		    dto.setFare(fare);
		  listDto.add(dto);
		}
		try {
		System.out.println(passService.passangerReservation(listDto));
		}
		catch(DataAccessException dae) {
			dae.printStackTrace();
		}
		((AbstractApplicationContext) ctx).close();
	}
}