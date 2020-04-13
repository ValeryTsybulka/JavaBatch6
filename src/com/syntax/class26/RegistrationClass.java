package com.syntax.class26;

public class RegistrationClass {
	private String email, userName, password;
	public String getEmail() {
	    return email;
	}
	public void setEmail(String email) {
	    if (email.contains("yahoo")) {
	        this.email=email;
	    }else {
	        System.out.println("Email should be 'yahoo' ");
	    }
	}
	public String getUserName() {
	    return userName;
	}
	public String getPassword() {
	    return password;
	}
	public void setUserName(String userName) {
	    if (!userName.isEmpty()) {
	        this.userName=userName;
	    }else {
	        System.out.println("Username cannot be empty");
	    }
	}
	public void setPassword(String password) {
	    if (password.length()>6 && !password.contains(userName)) {
	        this.password=password;
	    }else {
	        System.out.println("passowrd cannot be less than 6 characters and cannot contain username");
	        
	    }
	}

}
