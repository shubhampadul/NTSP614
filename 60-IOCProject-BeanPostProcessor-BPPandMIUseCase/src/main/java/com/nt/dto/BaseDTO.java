package com.nt.dto;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BaseDTO {
	private int id;
	private String name;
	private String addrs;
	private Date doj;
	
	@Override
	public String toString() {
		return "BaseDTO [id=" + id + ", name=" + name + ", addrs=" + addrs + ", doj=" + doj + "]";
	}
	
	
	

}
