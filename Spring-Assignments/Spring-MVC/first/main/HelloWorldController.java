package net.thirdassmt3;

import org.springframework.web.bind.annotation.RequestMapping;

public class HelloWorldController {
	
		@RequestMapping("/Control")
		public String Control()
		{
			return "helloWorld.jsp";
		}
		

	}


