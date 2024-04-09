package com.nt.beans;

public class B {
	private A a;
	
	public B() {
		System.out.println("B.B()");
	}
	
	public void setA(A a) {
		this.a = a;
	}

	@Override
	public String toString() {
		return "B";
	}

	
	
	
}
