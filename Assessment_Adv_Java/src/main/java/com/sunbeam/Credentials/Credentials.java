package com.sunbeam.Credentials;

public class Credentials {
	private String email;
	private String password;

	public Credentials(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}

	public Credentials() {
		// TODO Auto-generated constructor stub
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
