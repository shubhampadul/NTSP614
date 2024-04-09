package com.nt.beans;

public class IntrAmtCalculator {
	private IntrAmtDetails details;

	public IntrAmtCalculator(IntrAmtDetails details) {
		System.out.println("IntrAmtCalculator 0 param constructor");
		this.details = details;
	}
	
	public float calcSimpleInter() {
		return details.getPamt()*details.getRate()*details.getTime()/100;
	}
	
	@Override
	public String toString() {
		return "IntrAmtCalculator [details=" + details + "]";
	}
	
	

}
