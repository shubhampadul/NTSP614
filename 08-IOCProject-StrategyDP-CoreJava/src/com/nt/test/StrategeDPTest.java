package com.nt.test;

import com.nt.engine.CNGEngine;
import com.nt.engine.DiselEngine;
import com.nt.engine.Engine;
import com.nt.engine.PetrolEngine;
import com.nt.engine.Vehicle;
import com.nt.engine.VehicleFactory;

public class StrategeDPTest {
	public static void main(String[] args) {
		//Engine engg=null;
		Vehicle vehicle=null;		
		
		/*
		 
		//create dependant class obj
		//engg=new PetrolEngine();
		//engg=new CNGEngine();
		//engg=new DiselEngine();
	
		//create target class obj
		vehicle=new Vehicle(engg);
		*/
		
		//get vehicle obj
		vehicle=VehicleFactory.getInstance("Petrol");
		//VehicleFactory.getInstance("cng");
		//call journey methods
		vehicle.journey("hyb", "banglore");		
	}

}
