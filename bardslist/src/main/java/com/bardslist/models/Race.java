package com.bardslist.models;

public class Race {
	
	private int race_id;
	private String race;
	
	//boilerplate
	public Race() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Race(int race_id, String race) {
		super();
		this.race_id = race_id;
		this.race = race;
	}

	public Race(String race) {
		super();
		this.race = race;
	}

	@Override
	public String toString() {
		return "Race [race_id=" + race_id + ", race=" + race + "]";
	}

	public int getRace_id() {
		return race_id;
	}

	public void setRace_id(int race_id) {
		this.race_id = race_id;
	}

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}
	
	
}
