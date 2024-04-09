package com.nt.test;

import com.nt.beans.Printer;

public class SingletonJavaClassTest {

	public static void main(String[] args) {
		Printer p1=null,p2=null;
		p1=Printer.getInstance();
		p2=Printer.getInstance();
		System.out.println("P1 hashCode ::"+p1.hashCode()+"\np2 hashCode ::"+p2.hashCode());
		System.out.println(p1==p2);

	}

}
