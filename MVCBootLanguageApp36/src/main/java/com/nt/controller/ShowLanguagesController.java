package com.nt.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nt.service.LanguageService;

@Controller
public class ShowLanguagesController {
	@Autowired
	private LanguageService service;
	
	/*@RequestMapping("/home.htm")
	public String showHomePage(){
		return "home";
	}
	*/
	
	@RequestMapping("/languages.htm")
	public String getLanguages(Map<String,Object> map){
		List<String> langList;
		//user Service
		langList=service.getLanguages();
		//add model attribute
		map.put("speakingLangs",langList);
		return "languages";
		
	}

}
