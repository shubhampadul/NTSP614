package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.ScheduleReminder;

public class FactoryBeanTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		ScheduleReminder reminder=null;
		
		//create ioc container
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		
		//call getBean()
		reminder=ctx.getBean("sr",ScheduleReminder.class);
		System.out.println(reminder.reminder());
		
		//close ioc container
		((AbstractApplicationContext) ctx).close();
		

	}

}
