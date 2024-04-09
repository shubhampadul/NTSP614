package com.nt.bo;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BaseBO {
	private int id;
	private String name;
	private String addrs;
	private Date doj;
	
	@Override
	public String toString() {
		return "BaseBO [id=" + id + ", name=" + name + ", addrs=" + addrs + ", doj=" + doj + "]";
	}
	
	
}
