package com.nt.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class BeanLifeCycle
		implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {
	 
	String name;
	int    age;
	
	public BeanLifeCycle(String name) {
		System.out.println("BeanLifeCycle.BeanLifeCycle()");
		this.name = name;
	}	
	
	public void setAge(int age) {
		System.out.println("BeanLifeCycle.setAge()");
		this.age = age;
	}
	@Override
	public void destroy() throws Exception {
		System.out.println("BeanLifeCycle.destroy()");

	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("BeanLifeCycle.afterPropertiesSet()");
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("BeanLifeCycle.setApplicationContext()");

	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("BeanLifeCycle.setBeanFactory()");

	}

	@Override
	public void setBeanName(String name) {
		System.out.println("BeanLifeCycle.setBeanName()");

	}

}
