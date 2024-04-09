package com.nt.advice;

import java.util.Arrays;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class PerformanceMonitoringAdvice implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		System.out.println("PerformanceMonitoringAdvice.invoke()");
		long start;
		long end;
		start = System.currentTimeMillis();
		System.out.println("before starting business method " + start);
		
		Object resVal = invocation.proceed();
		end = System.currentTimeMillis();
		System.out.println("after business method execution " + end);
		System.out.println((end - start) + " ms taken to execute " + invocation.getMethod().getName());
		
		return resVal;
	}
}