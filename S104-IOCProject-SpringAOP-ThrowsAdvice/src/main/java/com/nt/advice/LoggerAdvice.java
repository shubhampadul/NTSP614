package com.nt.advice;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.lang.reflect.Method;
import java.util.Arrays;

public class LoggerAdvice implements org.springframework.aop.ThrowsAdvice{
	String logMsg=null;
	
	public void afterThrowing(Method method,Object args[],Object target,Throwable exception) throws IOException {
	logMsg=exception.getClass()+" Exception is raised in "+method.getName()+"with args "+Arrays.toString(args)+" in "+target.getClass();
	Writer writer =new FileWriter("G:/lonMsg.txt",true);	
	writer.write(logMsg+"\n");
	writer.flush();
	writer.close();
	throw new IllegalArgumentException("Invalid Inputs");
	}//method
}//class