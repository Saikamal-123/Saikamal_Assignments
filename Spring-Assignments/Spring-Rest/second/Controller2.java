package com.rest.second;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller2 {
	@Autowired
	Login login;
	
	@RequestMapping("/valid/{user}/{pass}")
	public String validate(@PathVariable String user,String pass)
	{
		return login.validate("kamal","kamal12345");
	}
	
	

}
