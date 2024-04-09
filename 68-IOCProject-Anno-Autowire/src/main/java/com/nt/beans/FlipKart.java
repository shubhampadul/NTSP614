package com.nt.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("flipkart")
public class FlipKart {

	@Autowired
	@Qualifier("bd")
	private Courier courier;

	public FlipKart() {
		System.out.println("FlipKart.FlipKart() 0-param constructor");
	}

	@Override
	public String toString() {
		return "FlipKart [courier=" + courier + "]";
	}
}