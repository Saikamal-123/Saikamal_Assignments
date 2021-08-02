package com.rest.third;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Findby {
	
	
	@Autowired
	Servicethird service;
	@RequestMapping("/details/{id}")
	public Details getDetails(@PathVariable Integer id)
	{
		return service.getDetails(id);
	}
	

}
