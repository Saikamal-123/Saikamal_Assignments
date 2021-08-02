package com.validation;

public class checking {
	
	public boolean validateUser(String name , String email ,String password) {
		return name.equalsIgnoreCase("kamal") && email.equalsIgnoreCase("kamal@14300") &&  password.equalsIgnoreCase("kamal143");
	}

}