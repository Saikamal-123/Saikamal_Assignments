package com.spring.security;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Userlog {
	
	@RequestMapping("/hello")
	public String login()
	{
		return "Hello World";
	}
	
	

}
