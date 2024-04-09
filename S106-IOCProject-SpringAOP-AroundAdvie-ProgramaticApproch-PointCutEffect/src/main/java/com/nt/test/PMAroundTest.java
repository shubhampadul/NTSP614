package com.nt.test;

import org.springframework.aop.framework.ProxyFactory;

import com.nt.advice.PerformanceMonitoringAdvice;
import com.nt.service.ArithmeticService;

public class PMAroundTest {

	public static void main(String[] args) {
		
		//create service obj
		ArithmeticService target=null,proxy=null;
	
		PerformanceMonitoringAdvice advice=new PerformanceMonitoringAdvice();
		
		target=new ArithmeticService();
		
		ProxyFactory factory=new ProxyFactory();
		
		factory.setTarget(target);
		factory.addAdvice(advice);
		
	     proxy =(ArithmeticService) factory.getProxy();
		
	    System.out.println("addition :"+proxy.add(100, 200));
	    System.out.println("sub :"+proxy.sub(300, 200));
	    System.out.println("div :"+proxy.div(100, 200));
	    System.out.println("mul :"+proxy.mul(100, 200));

	}

}
