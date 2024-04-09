package com.nt.engine;

public class PetrolEngine  implements Engine{
	@Override
	public void start() {
		System.out.println("PetrolEnigne.start()");
		
	}
	@Override
	public void stop() {
		System.out.println("PetrolEnigne.stop()");
	}
}
