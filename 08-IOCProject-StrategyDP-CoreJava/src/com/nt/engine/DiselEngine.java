
package com.nt.engine;

public final class DiselEngine implements Engine{
	
	/*static {
		System.out.println("DiselEngine.static block ");
	}
	
	public DiselEngine(){
		System.out.println("DiselEngine. 0 param constructor ");
	}
*/
	
	@Override
	public void start() {
		System.out.println("DiselEngine.start()");
		
	}
	
	@Override
	public void stop() {
		System.out.println("DiselEngine.stop()");
		
	}

}
