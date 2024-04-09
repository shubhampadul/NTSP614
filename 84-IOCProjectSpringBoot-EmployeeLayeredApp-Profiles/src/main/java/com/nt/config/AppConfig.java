package com.nt.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({PersistanceConfig.class,ServiceConfig.class})
@ComponentScan(basePackages="com.nt.controller")
public class AppConfig {
	public AppConfig() {
		System.out.println("AppConfig.AppConfig()");
	}

}
