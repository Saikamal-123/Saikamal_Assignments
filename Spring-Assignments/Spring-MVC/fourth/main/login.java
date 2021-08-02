package com.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.concurrent.SuccessCallback;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.model.User;
import com.validation.checking;

@Controller
public class login {

	
	checking checking = new checking();
	
	@RequestMapping("/Control")
	public String form (@ModelAttribute User user , Model model) {
		
		if (! checking.validateUser(user.name, user.email, user.password))
		{
			return "error.jsp";
		}
		

		
		return "success.jsp";
		
	}
	
	
}