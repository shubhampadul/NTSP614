package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.BillAmmountCalc;

public class ThrowsAdviceTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		BillAmmountCalc  proxy=null;
		
		//create io,c conatiner
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		
		//get proxy class object
		proxy=ctx.getBean("pfb",BillAmmountCalc.class);
		try {
		//call b method
		System.out.println("Total bill ammount= "+proxy.calcBillAmount(new String[] {"pant","shirt"},new Float[]{2000f,2558f}));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println(".........First END.............");
	
		try {
			//call b method
			System.out.println("Total bill ammount= "+proxy.calcBillAmount(null,new Float[]{2000f,2558f}));
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		((AbstractApplicationContext) ctx).close();
	}
}
