package com.k9;

public class HelloBean {

	private String name;
	private String password;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String checkUser() {
		String str = null;
		if (name.equalsIgnoreCase("user")&& password.equalsIgnoreCase("user")) 
		{
			str = "success";
			return str;
		} 
		else 
		{
			str = "failure";
			return str;
		}
	}
}
