package com.nt.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nt.dto.ProfileDTO;
import com.nt.service.FBProfileService;

@Controller
public class ShowProfilesController {
	@Autowired
	private FBProfileService service;
	
	@RequestMapping("/home.htm")
	public String showHomePage(){
		return "home";
	}
	
	@RequestMapping("/list_profiles.htm")
	public String getAllProfiles(Map<String,Object> map){
		List<ProfileDTO> listDTO=null;
		//get All Profiles
		listDTO=service.fetchAllProfiles();
		//add model attribute
		map.put("listProfiles",listDTO);
		
		return "show_profiles";
	}

}
