package com.nt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ShowHomeController {

	 @RequestMapping("/home.htm")
	public String showHomePage(){
		return "welcome";
	}
}
