package net.secondassmt2;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SimpleIntrestController {
	public ModelAndView add( HttpServletRequest request ,HttpServletResponse response   )
	{
		double i = Integer.parseInt(request.getParameter("amount"));
	    double j = Integer.parseInt(request.getParameter("years"));
	    double k =  Integer.parseInt(request.getParameter("interest"));
	    
	    double I = i*j*k/100;
	    ModelAndView mv = new ModelAndView();
	    mv.setViewName("display.jsp");
	    mv.addObject("result", I);
	    
	    return mv;
	}

}
