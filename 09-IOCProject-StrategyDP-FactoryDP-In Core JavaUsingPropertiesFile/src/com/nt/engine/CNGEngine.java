package com.nt.engine;

public class CNGEngine implements Engine{
	@Override
	public void start() {
		System.out.println("CNGEngine.start()");
	}
	@Override
	public void stop() {
		System.out.println("CNGEngine.stop()");
	}

}
