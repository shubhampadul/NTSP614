package com.nt.aspect;

import java.util.Arrays;
import org.aspectj.lang.ProceedingJoinPoint;

public class PerformanceMonitoringAspect{

	
	public Object moniter(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("PerformanceMonitoringAdvice.invoke()");
		long start;
		long end;
		start = System.currentTimeMillis();
		System.out.println("before starting business method " + start);

		Object resVal = pjp.proceed();
		end = System.currentTimeMillis();
		System.out.println("after business method execution " + end);
		System.out.println((end - start) + " ms taken to execute " + pjp.getClass() +"method with args"+pjp.getArgs());
		
		return resVal;
	}
}