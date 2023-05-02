package com.examly.springapp.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserModel {

	@Id
	String email;
	String password;
	String username;
	String mobileNumber;
	String userRole;
	
	public UserModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserModel(String email, String password, String username, String mobileNumber, String userRole) {
		super();
		this.email = email;
		this.password = password;
		this.username = username;
		this.mobileNumber = mobileNumber;
		this.userRole = userRole;
	}
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
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getUserRole() {
		return userRole;
	}
	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}
	
	@Override
	public String toString() {
		return "UserModel [email=" + email + ", password=" + password + ", username=" + username + ", mobileNumber="
				+ mobileNumber + ", userRole=" + userRole + "]";
	}
	
	
}
