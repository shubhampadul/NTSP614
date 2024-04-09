package com.nt.bpp;

import java.util.Date;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import com.nt.dto.EmployeeDTO;

public class CustomBeanPostProcessor implements BeanPostProcessor{
	
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException 
    {
        System.out.println("Called postProcessBeforeInitialization() for :" + beanName);
        if(bean instanceof EmployeeDTO)
        ((EmployeeDTO)bean).setDate(new Date());
        
        return bean;
    }
     
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException 
    {
        System.out.println("Called postProcessAfterInitialization() for :" + beanName);
        return bean;
    }

}
