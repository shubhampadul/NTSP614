package com.nt.beans;

import java.lang.reflect.Method;
import java.util.Arrays;

import org.springframework.beans.factory.support.MethodReplacer;

public class InterRateReplacer implements MethodReplacer {
	
	public InterRateReplacer() {
		System.out.println("InterRateReplacer.reimplement()");
	}

	public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
		System.out.println("InterRateReplacer.reimplement()");
		System.out.println("Bean Class name"+obj.getClass());
		System.out.println("Method name"+method.getName());
		System.out.println("Method args"+Arrays.toString(args));
		float p=(Float)args[0];
		float time=(Float)args[1];
		float rate=(Float)args[2];
	
		return p*Math.pow(1+rate/100, time)-p;
	}
	

}
