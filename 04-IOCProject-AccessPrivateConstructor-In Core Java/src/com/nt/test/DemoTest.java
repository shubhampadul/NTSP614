package com.nt.test;

import java.lang.reflect.Constructor;


import com.nt.demo.Demo;

public class DemoTest {
	public static void main(String[] args)throws Exception {
		Constructor cons1[]=null;
		Class c1=null;
		Object obj1=null;
		//load the class dynamically at runtime
		 c1=Class.forName("com.nt.demo.Demo");

		//get all constructors of Demo class
		cons1=c1.getDeclaredConstructors();
		
		//assess private no parameterized constructor
		cons1[1].setAccessible(true);
		obj1=cons1[1].newInstance();
		System.out.println(obj1.toString());
		System.out.println("............");
		
		//assess private parameterized constructor
		cons1[0].setAccessible(true);
		obj1=cons1[0].newInstance(10,20);
		System.out.println(obj1.toString());
		System.out.println("...............");
		
	}
}