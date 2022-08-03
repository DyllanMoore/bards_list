package com.bardslist.models;

public class Roster {
	private int dm_roster_id;
	private Login login_id;
	private Character character_one;
	private Character character_two;
	private Character character_three;
	private Character character_four;
	private Character character_five;
	private Character character_six;
	
	private int character_one_fk;
	private int character_two_fk;
	private int character_three_fk;
	private int character_four_fk;
	private int character_five_fk;
	private int charcater_six_fk;
	
	//boilerplate
	public Roster() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Roster(int dm_roster_id, Login login_id, Character character_one, Character character_two,
			Character character_three, Character character_four, Character character_five, Character character_six) {
		super();
		this.dm_roster_id = dm_roster_id;
		this.login_id = login_id;
		this.character_one = character_one;
		this.character_two = character_two;
		this.character_three = character_three;
		this.character_four = character_four;
		this.character_five = character_five;
		this.character_six = character_six;
	}

	public Roster(Login login_id, Character character_one, Character character_two, Character character_three,
			Character character_four, Character character_five, Character character_six) {
		super();
		this.login_id = login_id;
		this.character_one = character_one;
		this.character_two = character_two;
		this.character_three = character_three;
		this.character_four = character_four;
		this.character_five = character_five;
		this.character_six = character_six;
	}

	public Roster(int dm_roster_id, Login login_id, int character_one_fk, int character_two_fk, int character_three_fk,
			int character_four_fk, int character_five_fk, int charcater_six_fk) {
		super();
		this.dm_roster_id = dm_roster_id;
		this.login_id = login_id;
		this.character_one_fk = character_one_fk;
		this.character_two_fk = character_two_fk;
		this.character_three_fk = character_three_fk;
		this.character_four_fk = character_four_fk;
		this.character_five_fk = character_five_fk;
		this.charcater_six_fk = charcater_six_fk;
	}

	public Roster(Login login_id, int character_one_fk, int character_two_fk, int character_three_fk,
			int character_four_fk, int character_five_fk, int charcater_six_fk) {
		super();
		this.login_id = login_id;
		this.character_one_fk = character_one_fk;
		this.character_two_fk = character_two_fk;
		this.character_three_fk = character_three_fk;
		this.character_four_fk = character_four_fk;
		this.character_five_fk = character_five_fk;
		this.charcater_six_fk = charcater_six_fk;
	}

	public Roster(int dm_roster_id, Login login_id) {
		super();
		this.dm_roster_id = dm_roster_id;
		this.login_id = login_id;
	}

	@Override
	public String toString() {
		return "Roster [dm_roster_id=" + dm_roster_id + ", login_id=" + login_id + ", character_one=" + character_one
				+ ", character_two=" + character_two + ", character_three=" + character_three + ", character_four="
				+ character_four + ", character_five=" + character_five + ", character_six=" + character_six
				+ ", character_one_fk=" + character_one_fk + ", character_two_fk=" + character_two_fk
				+ ", character_three_fk=" + character_three_fk + ", character_four_fk=" + character_four_fk
				+ ", character_five_fk=" + character_five_fk + ", charcater_six_fk=" + charcater_six_fk + "]";
	}

	public int getDm_roster_id() {
		return dm_roster_id;
	}

	public void setDm_roster_id(int dm_roster_id) {
		this.dm_roster_id = dm_roster_id;
	}

	public Login getLogin_id() {
		return login_id;
	}

	public void setLogin_id(Login login_id) {
		this.login_id = login_id;
	}

	public Character getCharacter_one() {
		return character_one;
	}

	public void setCharacter_one(Character character_one) {
		this.character_one = character_one;
	}

	public Character getCharacter_two() {
		return character_two;
	}

	public void setCharacter_two(Character character_two) {
		this.character_two = character_two;
	}

	public Character getCharacter_three() {
		return character_three;
	}

	public void setCharacter_three(Character character_three) {
		this.character_three = character_three;
	}

	public Character getCharacter_four() {
		return character_four;
	}

	public void setCharacter_four(Character character_four) {
		this.character_four = character_four;
	}

	public Character getCharacter_five() {
		return character_five;
	}

	public void setCharacter_five(Character character_five) {
		this.character_five = character_five;
	}

	public Character getCharacter_six() {
		return character_six;
	}

	public void setCharacter_six(Character character_six) {
		this.character_six = character_six;
	}

	public int getCharacter_one_fk() {
		return character_one_fk;
	}

	public void setCharacter_one_fk(int character_one_fk) {
		this.character_one_fk = character_one_fk;
	}

	public int getCharacter_two_fk() {
		return character_two_fk;
	}

	public void setCharacter_two_fk(int character_two_fk) {
		this.character_two_fk = character_two_fk;
	}

	public int getCharacter_three_fk() {
		return character_three_fk;
	}

	public void setCharacter_three_fk(int character_three_fk) {
		this.character_three_fk = character_three_fk;
	}

	public int getCharacter_four_fk() {
		return character_four_fk;
	}

	public void setCharacter_four_fk(int character_four_fk) {
		this.character_four_fk = character_four_fk;
	}

	public int getCharacter_five_fk() {
		return character_five_fk;
	}

	public void setCharacter_five_fk(int character_five_fk) {
		this.character_five_fk = character_five_fk;
	}

	public int getCharcater_six_fk() {
		return charcater_six_fk;
	}

	public void setCharcater_six_fk(int charcater_six_fk) {
		this.charcater_six_fk = charcater_six_fk;
	}

	
}