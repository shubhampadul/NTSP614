package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.CNGEngine;
import com.nt.beans.DiselEngine;
import com.nt.beans.Engine;
import com.nt.beans.PetrolEngine;
import com.nt.beans.Vehicle;

public class StrategeDPTest {
	public static void main(String[] args) {
		 BeanFactory factory=null;
		 Vehicle     vehicle=null;
		 
		 //create IOC container 
		 factory=new XmlBeanFactory(new FileSystemResource("src/com/nt/cfgs/applicationContext.xml"));
		 
		 //get Vehicle class obj
		 vehicle=factory.getBean("vehicle",Vehicle.class);
		 
		 
		vehicle.journey("hyb", "banglore");		
	}

}
