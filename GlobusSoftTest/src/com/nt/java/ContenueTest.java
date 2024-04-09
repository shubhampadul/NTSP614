package com.nt.java;

public class ContenueTest {

	public static void main(String[] args) {
		int x;
		for(x=-1;x<=10;x++) {
			if(x<5) 
				continue;
			else
				//break;
			System.out.println("i::"+x);
		}
		//System.out.println("i::"+x);
	}

}
