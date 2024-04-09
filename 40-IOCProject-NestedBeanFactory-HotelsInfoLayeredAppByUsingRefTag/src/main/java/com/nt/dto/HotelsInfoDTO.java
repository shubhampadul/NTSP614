package com.nt.dto;

import java.io.Serializable;

import lombok.Data;
@Data
public class HotelsInfoDTO implements Serializable {
	private int  srNo;
	private long regNo;
	private String hname;
	private String type;
	private String addrs;
	private String loc;
	private String checkIn;
	private String checkOut;
}
