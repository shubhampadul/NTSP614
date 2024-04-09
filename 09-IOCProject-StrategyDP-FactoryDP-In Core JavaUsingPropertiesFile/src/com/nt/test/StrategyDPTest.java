package com.nt.test;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

import com.nt.engine.Vehicle;
import com.nt.engine.VehicleFactory;

public class StrategyDPTest {
	
	
	public static void main(String[] args) {
		Vehicle vehicle=null;
		Properties props=null;
		String engineMode=null;
	
		try {
	InputStream is=new FileInputStream("src/com/nt/commons/application.properties");
	props=new Properties();
	props.load(is);
	engineMode=props.getProperty("engineType");
	}
		
	catch(Exception e) {
		e.printStackTrace();
	}
		
		vehicle=VehicleFactory.getInstance(engineMode);
		
		vehicle.journey("hyd", "amravati");
	}
}