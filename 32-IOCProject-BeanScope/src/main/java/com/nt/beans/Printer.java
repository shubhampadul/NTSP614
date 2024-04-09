package com.nt.beans;

public class Printer {
	private static Printer INSTANCE=null;
	
	public static Printer getInstance() {
		if(INSTANCE==null){
			INSTANCE=new Printer();
		}
		else {
			return INSTANCE;
		}
		return INSTANCE;
	}
	
	
}
