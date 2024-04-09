package com.nt.engine;

public class VehicleFactory {
	
	
	
	public static Vehicle getInstance(String engineType) {
		Engine engine=null;
		Vehicle vehicle=null;
		
		if(engineType.equalsIgnoreCase("Disel"))
			engine=new DiselEngine();
		else if(engineType.equalsIgnoreCase("Petrol"))
			engine=new PetrolEngine();
		else if(engineType.equalsIgnoreCase("cng"))
			engine=new CNGEngine();
		else
			throw new IllegalArgumentException("Invalid Engine");
		
		//create target class obj by passing dependant class obj
		vehicle=new Vehicle(engine);
		
		return vehicle;
	}
	

}
