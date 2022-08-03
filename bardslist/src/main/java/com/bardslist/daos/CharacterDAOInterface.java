package com.bardslist.daos;

import java.util.ArrayList;

public interface CharacterDAOInterface {

	//new character
	boolean newCharacter(Character character);
	
	//get characters
	ArrayList<Character> getCharacter();
	
	ArrayList<Character> getCharacterByRace(int race_fk);
	
	ArrayList<Character> getCharacterByCharacterClass(int chaaracter_class_fk);
	
	ArrayList<Character> getCharacterByBackground(int background_fk);
	
	ArrayList<Character> getCharacterByAlignment(int alignment_fk);
	
	ArrayList<Character> getCharacterByLanguage(int language_fk);
	
	//get by name
	Character getCharacterByName(String character_name);
	
	
}
