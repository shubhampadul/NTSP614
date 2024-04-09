package com.nt.event;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class PerformanceEvaluatorListner implements ApplicationListener{
	 private Long start;
	 private Long end;
	 
	PerformanceEvaluatorListner(){
		System.out.println("PerformanceEvaluatorListner-0 Param Constructor");
	}
	public void onApplicationEvent(ApplicationEvent event) {
		System.out.println("PerformanceEvaluatorListner.onApplicationEvent() method");
		System.out.println(event);
		if(event.toString().indexOf("Refreshed")!=-1) {
			start=System.currentTimeMillis();
		}
		else {
			end=System.currentTimeMillis();
			System.out.println("Container acting time"+(end-start)+ "ms");
		}
	}//method
}//class