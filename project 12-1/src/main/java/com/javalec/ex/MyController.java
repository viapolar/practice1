package com.javalec.ex;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
	
	@RequestMapping("/view")
	public String view() {
		
		return "view";
	}
}
