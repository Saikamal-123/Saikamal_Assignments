package com.registration;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.login.info.validation;

import model1.User1;
import model1.User2;

@Controller
public class registration {


	@RequestMapping("/registartion")
	public String registrationform(@ModelAttribute User1 re1 , Model model1) {
		
		return "login.jsp";
	}

	

	@RequestMapping("/login")
	public String registrationform(@ModelAttribute User2 re2 , Model model2) {

		if (validation.checking (re2.name1,re2.email1, re2.password1) ) {
			
			return "error.jsp";		
		}
		
		return "success.jsp";

}





	
	
	
	
	
	
	
}