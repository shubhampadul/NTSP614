package com.nt.dto;

import lombok.Data;

@Data
public class PassangerResDto {
	private int pid;
	private String pname;
	private String source;
	private String dest;
	private int fare;
}