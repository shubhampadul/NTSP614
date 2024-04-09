package com.nt.beans;

public class B {
	private A a;
	

	
	public B(A a) {
		System.out.println("B.1-param B()");
		this.a = a;
	}



	/*public void setA(A a) {
		this.a = a;
	}
*/
	@Override
	public String toString() {
		return "B";
	}

	
	
	
}
