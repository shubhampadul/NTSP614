package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.nt.beans.WishMessage;
import com.nt.config.AppConfig;

public class WishMessageTest {

	public static void main(String[] args) {
		ApplicationContext ctx = null;
		WishMessage wishMessage = null;

		// create ioc container
		ctx = new AnnotationConfigApplicationContext(AppConfig.class);

		// get WishMessage Object
		wishMessage = ctx.getBean("wmg", WishMessage.class);

		System.out.println(wishMessage.generateWishMessage("Rajeshwar"));
		// close ioc container
		((AbstractApplicationContext) ctx).close();

	}// main method
}// class