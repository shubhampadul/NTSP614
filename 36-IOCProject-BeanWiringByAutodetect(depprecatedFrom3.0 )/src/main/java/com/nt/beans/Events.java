package com.nt.beans;

import java.util.Arrays;

public class Events {
	private String[] games;

	public Events() {
		System.out.println("Events class. 0-param Constructor");
	}
	
	public void setGames(String[] games) {
		System.out.println("Events.setGames()");
		this.games = games;
	}


	@Override
	public String toString() {
		return "Events [games=" + Arrays.toString(games) + "]";
	}
	
}
