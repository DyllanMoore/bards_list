package com.bardslist.models;

public class Alignment {
	private int alignment_id;
	private String alignment;
	
	//Boilerplate
	public Alignment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Alignment(int alignment_id, String alignment) {
		super();
		this.alignment_id = alignment_id;
		this.alignment = alignment;
	}

	public Alignment(String alignment) {
		super();
		this.alignment = alignment;
	}

	@Override
	public String toString() {
		return "Alignment [alignment_id=" + alignment_id + ", alignment=" + alignment + "]";
	}

	public int getAlignment_id() {
		return alignment_id;
	}

	public void setAlignment_id(int alignment_id) {
		this.alignment_id = alignment_id;
	}

	public String getAlignment() {
		return alignment;
	}

	public void setAlignment(String alignment) {
		this.alignment = alignment;
	}
	
}
