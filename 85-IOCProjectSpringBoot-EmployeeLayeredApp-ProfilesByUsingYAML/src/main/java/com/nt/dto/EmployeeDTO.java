package com.nt.dto;

import java.io.Serializable;

import lombok.Data;
@Data 
public class EmployeeDTO implements Serializable{
	
	String empName;
	String empAddrs;
	float  basicSal;
	
	}
