package com.nt.bean;

import java.util.Random;
public class Bat {
	Random rad=new Random();
	int runScore=rad.nextInt(300);
	
	public Bat() {
		System.out.println("Bat 0-param()");
	}
	public void score() {
		System.out.println("runs :"+runScore);
	}
}