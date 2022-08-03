package com.bardslist.models;

import java.util.Arrays;

public class Character {
	private int character_id;
	private String character_name;
	private int character_age;
	private byte[] character_image;
	private int charcater_level;
	private Race race;
	private CharacterClass character_class;
	private Background background;
	private Alignment alignment;
	private String personality_one;
	private String personality_two;
	private String ideal;
	private String bond;
	private String flaw;
	private String character_bio;
	private Language language;
	
	private int race_fk;
	private int character_class_fk;
	private int background_fk;
	private int alignment_fk;
	private int language_fk;
	
	//boilerplate
	public Character() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Character(int character_id, String character_name, int character_age, byte[] character_image,
			int charcater_level, Race race, CharacterClass character_class, Background background, Alignment alignment,
			String personality_one, String personality_two, String ideal, String bond, String flaw,
			String character_bio, Language language) {
		super();
		this.character_id = character_id;
		this.character_name = character_name;
		this.character_age = character_age;
		this.character_image = character_image;
		this.charcater_level = charcater_level;
		this.race = race;
		this.character_class = character_class;
		this.background = background;
		this.alignment = alignment;
		this.personality_one = personality_one;
		this.personality_two = personality_two;
		this.ideal = ideal;
		this.bond = bond;
		this.flaw = flaw;
		this.character_bio = character_bio;
		this.language = language;
	}

	public Character(String character_name, int character_age, byte[] character_image, int charcater_level, Race race,
			CharacterClass character_class, Background background, Alignment alignment, String personality_one,
			String personality_two, String ideal, String bond, String flaw, String character_bio, Language language) {
		super();
		this.character_name = character_name;
		this.character_age = character_age;
		this.character_image = character_image;
		this.charcater_level = charcater_level;
		this.race = race;
		this.character_class = character_class;
		this.background = background;
		this.alignment = alignment;
		this.personality_one = personality_one;
		this.personality_two = personality_two;
		this.ideal = ideal;
		this.bond = bond;
		this.flaw = flaw;
		this.character_bio = character_bio;
		this.language = language;
	}

	public Character(int character_id, String character_name, int character_age, byte[] character_image,
			int charcater_level, String personality_one, String personality_two, String ideal, String bond, String flaw,
			String character_bio, int race_fk, int character_class_fk, int background_fk, int alignment_fk,
			int language_fk) {
		super();
		this.character_id = character_id;
		this.character_name = character_name;
		this.character_age = character_age;
		this.character_image = character_image;
		this.charcater_level = charcater_level;
		this.personality_one = personality_one;
		this.personality_two = personality_two;
		this.ideal = ideal;
		this.bond = bond;
		this.flaw = flaw;
		this.character_bio = character_bio;
		this.race_fk = race_fk;
		this.character_class_fk = character_class_fk;
		this.background_fk = background_fk;
		this.alignment_fk = alignment_fk;
		this.language_fk = language_fk;
	}

	public Character(String character_name, int character_age, byte[] character_image, int charcater_level,
			String personality_one, String personality_two, String ideal, String bond, String flaw,
			String character_bio, int race_fk, int character_class_fk, int background_fk, int alignment_fk,
			int language_fk) {
		super();
		this.character_name = character_name;
		this.character_age = character_age;
		this.character_image = character_image;
		this.charcater_level = charcater_level;
		this.personality_one = personality_one;
		this.personality_two = personality_two;
		this.ideal = ideal;
		this.bond = bond;
		this.flaw = flaw;
		this.character_bio = character_bio;
		this.race_fk = race_fk;
		this.character_class_fk = character_class_fk;
		this.background_fk = background_fk;
		this.alignment_fk = alignment_fk;
		this.language_fk = language_fk;
	}

	@Override
	public String toString() {
		return "Character [character_id=" + character_id + ", character_name=" + character_name + ", character_age="
				+ character_age + ", character_image=" + Arrays.toString(character_image) + ", charcater_level="
				+ charcater_level + ", race=" + race + ", character_class=" + character_class + ", background="
				+ background + ", alignment=" + alignment + ", personality_one=" + personality_one
				+ ", personality_two=" + personality_two + ", ideal=" + ideal + ", bond=" + bond + ", flaw=" + flaw
				+ ", character_bio=" + character_bio + ", language=" + language + ", race_fk=" + race_fk
				+ ", character_class_fk=" + character_class_fk + ", background_fk=" + background_fk + ", alignment_fk="
				+ alignment_fk + ", language_fk=" + language_fk + "]";
	}

	public int getCharacter_id() {
		return character_id;
	}

	public void setCharacter_id(int character_id) {
		this.character_id = character_id;
	}

	public String getCharacter_name() {
		return character_name;
	}

	public void setCharacter_name(String character_name) {
		this.character_name = character_name;
	}

	public int getCharacter_age() {
		return character_age;
	}

	public void setCharacter_age(int character_age) {
		this.character_age = character_age;
	}

	public byte[] getCharacter_image() {
		return character_image;
	}

	public void setCharacter_image(byte[] character_image) {
		this.character_image = character_image;
	}

	public int getCharcater_level() {
		return charcater_level;
	}

	public void setCharcater_level(int charcater_level) {
		this.charcater_level = charcater_level;
	}

	public Race getRace() {
		return race;
	}

	public void setRace(Race race) {
		this.race = race;
	}

	public CharacterClass getCharacter_class() {
		return character_class;
	}

	public void setCharacter_class(CharacterClass character_class) {
		this.character_class = character_class;
	}

	public Background getBackground() {
		return background;
	}

	public void setBackground(Background background) {
		this.background = background;
	}

	public Alignment getAlignment() {
		return alignment;
	}

	public void setAlignment(Alignment alignment) {
		this.alignment = alignment;
	}

	public String getPersonality_one() {
		return personality_one;
	}

	public void setPersonality_one(String personality_one) {
		this.personality_one = personality_one;
	}

	public String getPersonality_two() {
		return personality_two;
	}

	public void setPersonality_two(String personality_two) {
		this.personality_two = personality_two;
	}

	public String getIdeal() {
		return ideal;
	}

	public void setIdeal(String ideal) {
		this.ideal = ideal;
	}

	public String getBond() {
		return bond;
	}

	public void setBond(String bond) {
		this.bond = bond;
	}

	public String getFlaw() {
		return flaw;
	}

	public void setFlaw(String flaw) {
		this.flaw = flaw;
	}

	public String getCharacter_bio() {
		return character_bio;
	}

	public void setCharacter_bio(String character_bio) {
		this.character_bio = character_bio;
	}

	public Language getLanguage() {
		return language;
	}

	public void setLanguage(Language language) {
		this.language = language;
	}

	public int getRace_fk() {
		return race_fk;
	}

	public void setRace_fk(int race_fk) {
		this.race_fk = race_fk;
	}

	public int getCharacter_class_fk() {
		return character_class_fk;
	}

	public void setCharacter_class_fk(int character_class_fk) {
		this.character_class_fk = character_class_fk;
	}

	public int getBackground_fk() {
		return background_fk;
	}

	public void setBackground_fk(int background_fk) {
		this.background_fk = background_fk;
	}

	public int getAlignment_fk() {
		return alignment_fk;
	}

	public void setAlignment_fk(int alignment_fk) {
		this.alignment_fk = alignment_fk;
	}

	public int getLanguage_fk() {
		return language_fk;
	}

	public void setLanguage_fk(int language_fk) {
		this.language_fk = language_fk;
	}
	
	
	
	
}
