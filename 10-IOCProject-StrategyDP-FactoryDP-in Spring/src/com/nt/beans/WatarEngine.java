package com.nt.beans;

public class WatarEngine implements Engine{
	@Override
	public void start() {
		System.out.println("WatarEngine.start()");
	}

	
	@Override
	public void stop() {
		System.out.println("WatarEngine.stop()");
	}
}
