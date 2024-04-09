package com.nt.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Import;

import com.nt.beans.WishMessage;
import com.nt.config.AppConfig;

@SpringBootApplication
@Import(AppConfig.class)
public class Application {
	public static void main(String[] args) {
		ApplicationContext ctx=null;
		WishMessage        generator=null;
		
		//get IOC container
		ctx = SpringApplication.run(Application.class, args);
		generator=ctx.getBean("wmg",WishMessage.class);
		System.out.println(generator.generateWishMsg("Rajeshwar"));
	}
}