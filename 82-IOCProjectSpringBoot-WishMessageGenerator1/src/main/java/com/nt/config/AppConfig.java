package com.nt.config;

import java.util.Calendar;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.nt.beans.WishMessage;

@Configuration
@Import(WishMessageConfig.class)
public class AppConfig {
	
	@Bean("cal")
	public Calendar createCalendar() {
		return Calendar.getInstance();
	}
}