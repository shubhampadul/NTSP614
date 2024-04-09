package com.nt.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class EmployeeDto implements Serializable{
	private int empid;
	private String ename;
	private String job;
	private int sal;

}