package com.nt.beans;

public class IntrAmtCalculator {
	private IntrAmtDetails details;

	public IntrAmtCalculator(IntrAmtDetails details) {
		System.out.println("IntrAmtCalculator 0 param constructor");
		this.details = details;
	}

	@Override
	public String toString() {
		return "IntrAmtCalculator [details=" + details + "]";
	}
	
	

}
