package com.nt.beans;

public class DTDC {
	static {
		System.out.println("DTDC.static block");
	}
	public DTDC() {
		System.out.println("DTDC.0 pram constructor");
	
	}
	
	public String deliver(int oid) {
		
		return "oreder number "+oid+"  deliver by DTDC";
		
	}
}
