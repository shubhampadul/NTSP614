package com.nt.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.stereotype.Component;

@Component("pmAdvice")
public class PerformanceMonitoringAdvice implements MethodInterceptor {
	public Object invoke(MethodInvocation invocation) throws Throwable {
		long start = System.currentTimeMillis();
		Object retVal = invocation.proceed();
		long end = System.currentTimeMillis();
		System.out.println(invocation.getMethod().getName() + " method has taken " + (end - start) + " time to complete");
		return retVal;
	}

}