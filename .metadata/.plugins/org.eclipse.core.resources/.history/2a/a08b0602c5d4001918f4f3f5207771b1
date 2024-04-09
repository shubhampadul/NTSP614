package com.nt.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("bd")
@Primary
public class BlueDart implements Courier {
	@Autowired(required=false)
	private String addrs;
	
	public BlueDart() {
		System.out.println("BlueDart.BlueDart() 0-param constructor");
	}

	@Override
	public String toString() {
		return "BlueDart [addrs=" + addrs + "]";
	}
	
	
}
