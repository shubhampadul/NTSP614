package com.nt.test;

import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.beans.PropertyEditorRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.beans.IntrAmtCalculator;
import com.nt.beans.IntrAmtDetails;
import com.nt.propeditors.CustomIntrAmtDetailsEditor;


public class IntrAmtCalculatorTest2 {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		IntrAmtCalculator calc=null;
		
		//create ioc container
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		
		//add property editors
		factory.addPropertyEditorRegistrar(new PropertyEditorRegistrar() {
			
			public void registerCustomEditors(PropertyEditorRegistry registry) {
				registry.registerCustomEditor(IntrAmtDetails.class,new CustomIntrAmtDetailsEditor());						
			}
		}
		);
		
		//call getBean()
		calc=factory.getBean("iac",IntrAmtCalculator.class);
		System.out.println(calc.calcSimpleInter());
	}
	
	
}//class