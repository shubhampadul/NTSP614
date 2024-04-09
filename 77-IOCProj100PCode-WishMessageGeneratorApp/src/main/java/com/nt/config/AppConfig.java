package com.nt.config;

import java.util.Date;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;

@ComponentScan(basePackages="com.nt.beans")
@Scope("prototype")
public class AppConfig {
	
	public AppConfig() {
		System.out.println("AppConfig 0-param constructor");
	}
	@Bean
	@Scope("prototype")
	public Date createDate1() {
		System.out.println("AppConfig.createDate1()");
		return new Date();
	}
	@Bean
	@Scope("prototype")
	public Date createDate2() {
		System.out.println("AppConfig.createDate2()");
		return new Date();
	}

}
