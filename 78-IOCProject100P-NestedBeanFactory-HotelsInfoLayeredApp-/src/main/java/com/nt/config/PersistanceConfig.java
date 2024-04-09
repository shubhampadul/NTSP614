package com.nt.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import com.zaxxer.hikari.HikariDataSource;

@Configuration
@ComponentScan(basePackages="com.nt.dao")
@PropertySource(value="classpath:com/nt/commons/jdbc.properties")
public class PersistanceConfig {
	@Autowired
	private Environment env;
	
	public PersistanceConfig() {
		System.out.println("PersistanceConfig.PersistanceConfig()");
	}
	@Bean(name="ds")
	public DataSource createDS() {
		HikariDataSource hds=new HikariDataSource();
		hds.setDriverClassName(env.getProperty("jdbc.driver"));
		hds.setJdbcUrl(env.getProperty("jdbc.url"));
		hds.setUsername(env.getProperty("jdbc.user"));
		hds.setPassword(env.getProperty("jdbc.pwd"));
		return hds;
	}
}