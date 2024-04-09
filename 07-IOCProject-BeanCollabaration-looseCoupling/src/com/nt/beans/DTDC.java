package com.nt.beans;

public class DTDC implements Courier{
	static {
		System.out.println("DTDC.static block");
	}
	public DTDC() {
		System.out.println("DTDC.0 pram constructor");
	
	}
	
	public String deliver(int oid) {		
		return "order number "+oid+"  deliver by DTDC";
	}
}
