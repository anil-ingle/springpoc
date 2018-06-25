package com.nt.controller;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nt.command.UserCommand;
import com.nt.dto.UserDTO;
import com.nt.service.LoginService;

@Controller
public class LoginController {
	@Resource
	private LoginService service;

	@RequestMapping(value="/login.htm",method=RequestMethod.GET)
	public String showForm(@ModelAttribute("userCmd") UserCommand cmd){
      return "login";		
	}
	
	@RequestMapping(value="/login.htm",method=RequestMethod.POST)
	public String processForm(Map<String,String>map,@ModelAttribute("userCmd") UserCommand cmd){
		UserDTO dto=null;
		String result=null;
		//Convert Command obj to DTO object
		dto=new UserDTO();
		BeanUtils.copyProperties(cmd,dto);
		 
		//use service
		result=service.validate(dto);
		//add to Model Attribute
		map.put("result", result);
		return "login";
	}//method
}//class
