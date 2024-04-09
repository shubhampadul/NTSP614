package com.nt.advice;

import java.util.HashMap;
import java.util.Map;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class CacheingAdvice implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		System.out.println("CacheingAdvice.invoke()");
		Object args[]=null;
		Map<String,Object> cacheMap=null;
		Object returnVal=null;
		String key=null;
	    //create hashMap object
		cacheMap=new HashMap();
		
		//get business method arguments
		args=invocation.getArguments();
		
		//get key
		key=invocation.getMethod()+invocation.getArguments();
		
		if(!cacheMap.containsKey(key)) {
			returnVal=invocation.proceed();
			
			cacheMap.put(invocation.getMethod()+invocation.getArguments(), returnVal);
			System.out.println("result are coming from target class");
			return returnVal;
		}
		else {
		System.out.println("result are coming from cache");
		return returnVal;
		}
	}

}
