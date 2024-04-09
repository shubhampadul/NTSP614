package com.nt.cfgs;

import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.nt.service.ArithmeticService;

@Configuration
@ComponentScan(basePackages={"com.nt.service","com.nt.advice"})
public class AppConfig {
	@Autowired
	ArithmeticService service;
	
	@Bean("pfb")
	public ProxyFactoryBean getProxyFactoryBean() {
		ProxyFactoryBean pfb=new ProxyFactoryBean();
		pfb.setTarget(service);
		pfb.setInterceptorNames("pmAdvice");
		return pfb;
	}
	
}
