package com.nt.anno.beans;

import java.util.Date;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component(value="vec")
public class VotingEligibilityCheck {

	@Value(value = "rajeshwar")
	private String name;
	@Value(value = "25")
	private int age;
	@Value(value = "hyd")
	private String addrs;
	@Autowired
	private Date sysdate;

	// setter and getter methods

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setAddrs(String addrs) {
		this.addrs = addrs;
	}

	public VotingEligibilityCheck(Date sysdate) {
		this.sysdate = sysdate;
	}

	// custom init() method
	@PostConstruct
	public void check() {
		System.out.println("custom init method check()");
		if (name == null || age < 0) {
			throw new IllegalArgumentException("name and age  must be set with values  ");
		}
	}

	public String checkVotingValidity() {
		if (age >= 18) {
			return "You are eligible for voting";
		} else {
			return "You are not eligible for voting wait " + (18 - age) + " years more";
		}
	}

	// custom distroy() method
	@PreDestroy
	public void myDistroy() {
		System.out.println("custom distroy method myDistroy()");
		name = null;
		age = 0;
		addrs = null;
		sysdate = null;
	}

	@Override
	public String toString() {
		return "VotingEligibilityCheck [name=" + name + ", age=" + age + ", addrs=" + addrs + ", sysdate=" + sysdate
				+ "]";
	}

	/*
	 * public void destroy() throws Exception {
	 * System.out.println("VotingEligibilityCheck.destroy()"); name=null; age=0;
	 * addrs=null; sysdate=null;
	 * 
	 * }
	 * 
	 * 
	 * public void afterPropertiesSet() throws Exception {
	 * System.out.println("VotingEligibilityCheck.afterPropertiesSet()");
	 * if(name==null||age<0) { throw new
	 * IllegalArgumentException("name and age  must be set with values  "); } }
	 */

}