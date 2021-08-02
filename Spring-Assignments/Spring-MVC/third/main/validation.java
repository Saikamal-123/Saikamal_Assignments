package com.login.info;

import model1.User1;

public class validation {

	
	public static boolean checking(String name , String email ,String password ) {
  User1 user1 = new User1();
		return name.equals("kamal") && email.equals("kamal@123") && password.equals("kamal123");	
}
}