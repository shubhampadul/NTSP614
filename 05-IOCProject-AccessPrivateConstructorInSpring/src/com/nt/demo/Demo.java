package com.nt.demo;

public class Demo {
	int a,b;
	
	static {
		System.out.println("Demo class static block");
	}
	
	private Demo() {
		System.out.println("Demo class no param private constructor");
	}
	
	private Demo(int a,int b) {
		System.out.println("Demo class parameterized  private constructor");
		this.a=a;
		this.b=b;
	}
	
	@Override
	public String toString() {
		return "Demo [a=" + a + ", b=" + b + "]";
	}
}
