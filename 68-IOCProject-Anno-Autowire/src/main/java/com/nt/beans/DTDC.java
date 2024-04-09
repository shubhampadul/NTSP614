package com.nt.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("dtdc")
//@Primary
public class DTDC implements Courier{
	@Autowired(required=true)
	@Value("hyd")
	private String addrs;
	public DTDC() {
		System.out.println("DTDC.DTDC() 0-param constructor");
	}
	@Override
	public String toString() {
		return "DTDC [addrs=" + addrs + "]";
	}
}