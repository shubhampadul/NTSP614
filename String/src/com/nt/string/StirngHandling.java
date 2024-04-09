package com.nt.string;

public class StirngHandling {

	public static void main(String[] args) {
		String s1="hello";
		System.out.println("s1 "+s1.hashCode());
		 s1=s1.concat("hi");
		
		System.out.println("s1 "+s1.hashCode());
	}

}
