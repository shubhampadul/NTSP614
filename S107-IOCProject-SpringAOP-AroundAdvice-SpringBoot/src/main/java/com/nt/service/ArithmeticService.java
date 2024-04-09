package com.nt.service;

import org.springframework.stereotype.Service;

@Service("service")
public class ArithmeticService {

	public float add(float a, float b) {
		return a + b;
	}
	
	public float sub(float a, float b) {
		return a - b;
	}
	public float mul(float a, float b) {
		return a * b;
	}
	
	public float div(float a, float b) {
		return a / b;
	}
}
