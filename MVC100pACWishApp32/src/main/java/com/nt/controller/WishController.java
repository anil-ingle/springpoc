package com.nt.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nt.service.WishService;

@Controller
public class WishController {
	@Autowired
	private WishService service;
	
	@RequestMapping(value="/home.htm")
	public String showHomePage(){
		return "home";
	}
	
	@RequestMapping(value="/wish.htm")
	public String  generateWishMsg(Map<String,Object>map){
		String msg=null;
		//use service
		msg=service.generateWishMessage();
		//add to Model Attribute
		map.put("wMsg", msg);
		return "result";
	}
	

}
