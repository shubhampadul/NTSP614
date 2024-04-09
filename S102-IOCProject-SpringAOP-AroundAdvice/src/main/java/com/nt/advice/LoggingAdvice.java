package com.nt.advice;

import java.util.Arrays;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class LoggingAdvice implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		System.out.println("LoggingAdvice.invoke()");
		Object returnVal=null;
		Object arg[]=null;
		System.out.println("Entering into "+invocation.getMethod().getName()+" with argurments "+Arrays.toString(invocation.getArguments()));
		
		returnVal=invocation.proceed();
		System.out.println("Exiting from "+invocation.getMethod().getName()+" with argurments "+Arrays.toString(invocation.getArguments()));
		
		return returnVal;
	}

}
