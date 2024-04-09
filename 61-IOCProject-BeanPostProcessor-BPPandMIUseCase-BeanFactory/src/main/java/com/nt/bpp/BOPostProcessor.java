package com.nt.bpp;

import java.util.Date;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import com.nt.bo.BaseBO;

public class BOPostProcessor implements BeanPostProcessor {
	
	public BOPostProcessor() {
		System.out.println("BOPostProcessor 0 param constructor");
	}
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("BOPostProcessor.postProcessAfterInitialization()");
		
		if(bean instanceof BaseBO) {
			((BaseBO) bean).setDoj(new Date());
		}
		return bean;
	}
	
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("BOPostProcessor.postProcessBeforeInitialization()");
		return bean;
	}
}
