package com.pojos;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

 
public class UserCredentials {

	@NotBlank(message="Email is Mandotory") 
	@Email(message="Invalid email ")
	private String email;
	@NotBlank(message="Password is mandotory")
	private String password;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public UserCredentials(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}
	public UserCredentials()
	{
		
	}
	
}
