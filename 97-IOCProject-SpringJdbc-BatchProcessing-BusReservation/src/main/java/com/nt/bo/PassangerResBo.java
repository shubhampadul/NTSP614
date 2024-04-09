package com.nt.bo;

import lombok.Data;

@Data
public class PassangerResBo {
	private int pid;
	private String pname;
	private String source;
	private String dest;
	private int fare;
}