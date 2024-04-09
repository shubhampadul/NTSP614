package com.nt.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.nt.dao")
public class PersistanceConfig {

	public PersistanceConfig() {

		System.out.println("PersistanceConfig.PersistanceConfig()");

	}

}