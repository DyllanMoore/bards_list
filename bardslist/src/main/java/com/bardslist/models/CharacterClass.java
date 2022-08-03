package com.bardslist.models;

public class CharacterClass {

	private int character_class_id;
	private String character_class;
	
	//boilerplate
	public CharacterClass() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CharacterClass(int character_class_id, String character_class) {
		super();
		this.character_class_id = character_class_id;
		this.character_class = character_class;
	}

	public CharacterClass(String character_class) {
		super();
		this.character_class = character_class;
	}

	@Override
	public String toString() {
		return "CharacterClass [character_class_id=" + character_class_id + ", character_class=" + character_class
				+ "]";
	}

	public int getCharacter_class_id() {
		return character_class_id;
	}

	public void setCharacter_class_id(int character_class_id) {
		this.character_class_id = character_class_id;
	}

	public String getCharacter_class() {
		return character_class;
	}

	public void setCharacter_class(String character_class) {
		this.character_class = character_class;
	}

}
