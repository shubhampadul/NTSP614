package com.nt.beans;


public class A {
	private B b;

	public A(B b) {
		System.out.println("A.1-param A()");
		this.b = b;
	}

	@Override
	public String toString() {
		return "A";
	}
	
	
	
	
	

}
