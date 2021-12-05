package com.sunbeam.Credentials;

import java.util.List;

import com.sunbeam.pojos.User;

public class UpdateDetails {
 private String name;
	private String email;
	private String city;
	private String cell_no;
	private Double reg_amount;
	private String reg_date;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCell_no() {
		return cell_no;
	}
	public void setCell_no(String cell_no) {
		this.cell_no = cell_no;
	}
	public Double getReg_amount() {
		return reg_amount;
	}
	public void setReg_amount(Double reg_amount) {
		this.reg_amount = reg_amount;
	}
	public String getReg_date() {
		return reg_date;
	}
	public void setReg_date(String reg_date) {
		this.reg_date = reg_date;
	}
	@Override
	public String toString() {
		return "UpdateDetails [name=" + name + ", email=" + email + ", city=" + city + ", cell_no=" + cell_no
				+ ", reg_amount=" + reg_amount + ", reg_date=" + reg_date + "]";
	}
//	public UpdateDetails(String name, String email, String city, String cell_no, Double reg_amount, String reg_date) {
//		super();
//		this.name = name;
//		this.email = email;
//		this.city = city;
//		this.cell_no = cell_no;
//		this.reg_amount = reg_amount;
//		this.reg_date = reg_date;
//	}
	
	

	public List<User> update(String name, String email, String city, String cell_no, Double reg_amount,String reg_date) {

		User user = new User();
		
		user.name = name;
		this.email = email;
		this.city = city;
		this.cell_no = cell_no;
		this.reg_amount = reg_amount;
		this.reg_date = reg_date;
		
		
		
		return null;
	}
	
	
	
	
	
	
	public UpdateDetails() {
		super();
		// TODO Auto-generated constructor stub
	} 
	
	
	
}
