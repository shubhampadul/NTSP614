package com.nt.beans;

import java.util.List;
import java.util.Set;

public class EnggCources {
	private List<String> subject;

	public EnggCources(List<String> subject){
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "EnggCources [subject=" + subject + "]";
	}
}
