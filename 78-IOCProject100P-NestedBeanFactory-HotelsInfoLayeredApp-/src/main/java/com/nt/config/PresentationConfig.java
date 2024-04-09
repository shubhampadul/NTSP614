package com.nt.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Lazy;


@Import(BusinessConfig.class)
@Lazy(value=true)
@Configuration
@ComponentScan(basePackages= {"com.nt.controller"})
public class PresentationConfig {
public PresentationConfig() {
	System.out.println("PresentationConfig.PresentationConfig()");
	}

}
