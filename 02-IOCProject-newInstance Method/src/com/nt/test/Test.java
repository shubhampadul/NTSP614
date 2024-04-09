package com.nt.test;

public class Test {
	int a ,b;
	
	static {
		System.out.println("Test class Static block");
	}
	
     public Test() {
    	 System.out.println("Test class o-param constructor");
     }
     public Test(int a,int b) {
    	 System.out.println("Test class 2-param constructor");
    	 this.a=a;
    	 this.b=b;
     }
     
     public String toString() {
    	return " a="+a+" b="+b;
     }
}
