package com.nt.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Lazy;

@Configuration
//@ComponentScan(basePackages= {"com.nt.dao"})
@Import({PersistanceConfig.class,ServiceConfig.class})
public class BusinessConfig {
	
	public BusinessConfig() {
		System.out.println("BusinessConfig.BusinessConfig()");
	}

}
