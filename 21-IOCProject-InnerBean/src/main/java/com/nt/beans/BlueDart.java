package com.nt.beans;

public class BlueDart implements Courier {
	static {
		System.out.println("BlueDart.static bbblock");
	}
	public BlueDart() {
		System.out.println("BlueDart.0 param constructor");
	}
	
    public String deliver(int oid) {	
		return "order number "+oid+"  deliver by BlueDart";	
	}
}
