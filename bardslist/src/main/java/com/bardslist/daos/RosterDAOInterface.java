package com.bardslist.daos;

import java.util.ArrayList;

import com.bardslist.models.Roster;

public interface RosterDAOInterface {
	
	//get roster by login id
	ArrayList<Roster> getRosterByLogin(int login_id);
	
	//update roster 
	boolean updateCharacterOne(int character_id);
	
	boolean updateCharacterTwo(int character_id);
	
	boolean updateCharacterThree(int character_id);
	
	boolean updateCharacterFour(int character_id);
	
	boolean updateCharacetrFive(int character_id);
	
	boolean updateCharacterSix(int character_id);
	
	//create new roster
	boolean newRoster(Roster roster);
	
}
