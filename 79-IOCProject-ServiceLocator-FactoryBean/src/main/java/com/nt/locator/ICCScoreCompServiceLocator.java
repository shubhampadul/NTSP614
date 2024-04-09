package com.nt.locator;

import org.springframework.beans.factory.FactoryBean;

import com.nt.external.ExternalICCScoreCompService;
import com.nt.external.ExternalICCScoreCompServiceImpl;

public class ICCScoreCompServiceLocator implements  FactoryBean<ExternalICCScoreCompService>{

	public ICCScoreCompServiceLocator() {
		System.out.println("ICCScoreCompServiceLocator.getObject()");
	}
	@Override
	public ExternalICCScoreCompService getObject() throws Exception {
		System.out.println("ICCScoreCompServiceLocator.getObject()");
		ExternalICCScoreCompService extService=null;
		
		//create external service comp object
		extService=new ExternalICCScoreCompServiceImpl();		
		return extService;
	}

	@Override
	public Class<?> getObjectType() {
		System.out.println("ICCScoreCompServiceLocator.getObjectType()");
		return ExternalICCScoreCompService.class;
	}
	
	@Override
	public boolean isSingleton() {
		System.out.println("ICCScoreCompServiceLocator.isSingleton()");
		return true;
	}
	 

}
