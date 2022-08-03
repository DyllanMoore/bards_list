package com.bardslist.models;

public class Language {
	private int language_id;
	private String language;
	
	//boilerplate
	public Language() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Language(int language_id, String language) {
		super();
		this.language_id = language_id;
		this.language = language;
	}

	public Language(String language) {
		super();
		this.language = language;
	}

	@Override
	public String toString() {
		return "Language [language_id=" + language_id + ", language=" + language + "]";
	}

	public int getLanguage_id() {
		return language_id;
	}

	public void setLanguage_id(int language_id) {
		this.language_id = language_id;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}
	
	
}
