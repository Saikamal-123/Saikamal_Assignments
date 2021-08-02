package com.spring.jdbc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloContoller {
	@GetMapping("/")
	public String demo() {
		return "Hello Everyone";
	}
	
	@GetMapping("/user")
	public String user() {
		return "Hello there.. user";
		
	}

	
	@GetMapping("/admin")
	public String admin() {
		return "Hello there.. admin";
		
	}


}
