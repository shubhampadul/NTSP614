package com.nt.demo;

public class Demo {
	int a,b;
	
	static {
		System.out.println("Demo class static block");
	}
	
	private Demo() {
		System.out.println("Demo class's  private no param constructor");
	}
	
	private Demo(int a,int b) {
		System.out.println("Demo class's private parameterized constructor");
		this.a=a;
		this.b=b;
	}

	@Override
	public String toString() {
		return "Demo [a=" + a + ", b=" + b + "]";
	}
	
	

}
