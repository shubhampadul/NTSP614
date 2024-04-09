package com.nt.engine;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class VehicleFactory {
	private static Properties props=null;
	
	static {
		try {
		//load properties file
		InputStream is=new FileInputStream("src/com/nt/commons/application.properties");
		props=new Properties();
		props.load(is);
		
		} catch (IOException e) {
			e.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public static Vehicle getInstance(String engineType) {
		Engine engine=null;
		Vehicle vehicle=null;
		String engineClass=null;
		 
		try {
		//get engine class
		engineClass=props.getProperty(engineType);
		
		//create engine class obje
		engine=(Engine)Class.forName(engineClass).newInstance();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	//create target clss object having dependant cls obj
	vehicle= new Vehicle(engine);
	
	//return vehicle
	return vehicle;
	}

}
