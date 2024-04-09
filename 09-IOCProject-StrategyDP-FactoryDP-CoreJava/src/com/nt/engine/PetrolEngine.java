package com.nt.engine;

public final class PetrolEngine implements Engine{
	/*static {
		System.out.println("PetrolEngine.static block ");
	}
	
	public PetrolEngine() {
		System.out.println("PetrolEngine. 0 param constructor ");
	}*/

	@Override
	public void start() {
		System.out.println("PetrolEngine.start()");
	}

	@Override
	public void stop() {
		System.out.println("PetrolEngine.stop()");
	}

}
