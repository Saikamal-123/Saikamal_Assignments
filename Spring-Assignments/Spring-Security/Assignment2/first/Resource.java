package com.spring.second;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Resource {
	@RequestMapping("/")
	public String demo() {
		return "Hello Everyone";
	}
	
	@RequestMapping("/user")
	public String user() {
		return "Hello there.. user";
		
	}

	
	@RequestMapping("/admin")
	public String admin() {
		return "Hello there.. admin";
		

}}
