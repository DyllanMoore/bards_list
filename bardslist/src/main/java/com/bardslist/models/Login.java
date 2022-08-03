package com.bardslist.models;

public class Login {
	private int login_id;
	private String usernmae;
	private String password;
	
	//boilerplate
	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Login(int login_id, String usernmae, String password) {
		super();
		this.login_id = login_id;
		this.usernmae = usernmae;
		this.password = password;
	}

	public Login(String usernmae, String password) {
		super();
		this.usernmae = usernmae;
		this.password = password;
	}

	@Override
	public String toString() {
		return "Login [login_id=" + login_id + ", usernmae=" + usernmae + ", password=" + password + "]";
	}

	public int getLogin_id() {
		return login_id;
	}

	public void setLogin_id(int login_id) {
		this.login_id = login_id;
	}

	public String getUsernmae() {
		return usernmae;
	}

	public void setUsernmae(String usernmae) {
		this.usernmae = usernmae;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
