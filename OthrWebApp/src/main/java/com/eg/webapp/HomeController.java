package com.eg.webapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	
	@RequestMapping("home")
	
	public String home()
	{
		System.err.println("hii");
		
		return "home.jsp";
	}
	
}
