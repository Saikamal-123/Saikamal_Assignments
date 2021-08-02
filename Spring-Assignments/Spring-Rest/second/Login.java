package com.rest.second;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
@Service
public class Login {
	
	//Userlogin users=new Userlogin("kamal","kamal12345"); 
	public String validate(String user,String pass)
	{
		if(user.equals("kamal")&&pass.equals("kamal12345"))
		{
			return "valid";
		}
		else
		{
			return "invalid";
		}
		
	}

}
