package com.nt.beans;

import org.springframework.beans.factory.annotation.Required;

public class Engine {
	
	private int engineId;
	private String engineCC;
	
	
	public void setEngineCC(String engineCC) {
		this.engineCC = engineCC;
	}
	
	@Required
	public void setEngineId(int engineId) {
		this.engineId = engineId;
	}

	@Override
	public String toString() {
		return "Engine [engineId=" + engineId + ", engineCC=" + engineCC + "]";
	}
}