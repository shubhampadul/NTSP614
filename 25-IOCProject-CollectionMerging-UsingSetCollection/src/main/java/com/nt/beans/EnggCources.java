package com.nt.beans;

import java.util.Set;

public class EnggCources {
	private Set<String> subject;

	public EnggCources(Set<String> subject){
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "EnggCources [subject=" + subject + "]";
	}
}
