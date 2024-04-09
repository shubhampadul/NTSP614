package com.nt.test;

import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.IntrAmtCalculator;
import com.nt.beans.IntrAmtDetails;
import com.nt.propeditors.CustomIntrAmtDetailsEditor;

public class IntrAmtCalculatorTest4 {

	public static void main(String[] args) {
		ApplicationContext ctx = null;

		IntrAmtCalculator calc = null;

		// create ioc container
		ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		
		ctx.getBean("cec",BeanPostProcessor.class);
		
		// call getBean()
		calc = ctx.getBean("iac", IntrAmtCalculator.class);
		System.out.println(calc.calcSimpleInter());
	}
}// class