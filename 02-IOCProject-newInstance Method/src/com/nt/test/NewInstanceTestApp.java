package com.nt.test;

import java.lang.reflect.Constructor;

public class NewInstanceTestApp {
	
	
	public static void main(String[] args) throws Exception{
		Class c1=null,c2=null;
		Object ob1=null,ob2=null,ob3=null,ob4=null;
		Constructor cons1[]=null,cons2[]; 
		//load the 1st class dynamically at run time 
		 c1=Class.forName(args[0]);
		 ob1=c1.newInstance();
		 System.out.println(ob1.toString());
		 System.out.println("...............");
		 
		//load the 2st class dynamically at run time 
		 c2=Class.forName(args[1]);
		 ob2=c2.newInstance();
		 System.out.println("Date and Time "+ob2.toString());
		 System.out.println("...............");
		 
		 //get all constructors of 1st class
		 cons1=c1.getDeclaredConstructors();
		 ob3=cons1[0].newInstance(10,20);
		 System.out.println("param const values "+ob3.toString());
		 System.out.println("...............");
		 
		 //get all constructors of 2nd class
		 cons2=c2.getDeclaredConstructors();
		 ob4=cons2[5].newInstance(119,7,15);
		 System.out.println(ob4.toString());
		 System.out.println("................");
	
	}

}
