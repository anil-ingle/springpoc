package com.nt.controller;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nt.command.UserCommand;
import com.nt.dto.UserDTO;
import com.nt.service.LoginService;
import com.nt.validator.LoginValidator;

@Controller
public class LoginController {
	@Resource
	private LoginService service;
	
	@Resource
	private LoginValidator validator;
	
	/*@RequestMapping(value="login.htm",method=RequestMethod.GET)
	public String showForm(Map<String,Object> map){
		UserCommand userCmd=null;
		//create Command class obj and add to model attribyute
		userCmd=new UserCommand();
		map.put("userCmd",userCmd);
		//return LVN
		return "login";
	}*/
	
	@RequestMapping(value="login.htm",method=RequestMethod.GET)
	public String showForm(@ModelAttribute("userCmd") UserCommand cmd){
		//return LVN
		return "login";
	}
	
	@RequestMapping(value="login.htm",method=RequestMethod.POST)
	public  String processForm(Map<String,Object> map,
			                    @ModelAttribute("userCmd")UserCommand cmd,
			                    BindingResult errors){
           UserDTO dto=null;
           String result=null;
           
           
           
         //supporting logic to enable validations
           if(validator.supports(UserCommand.class)){
        	   validator.validate(cmd,errors);
        	   if(errors.hasErrors())
        		   return "login";
           }
           
           if(cmd.getUser().equals("raja")){
        	   errors.rejectValue("user","raja.blocked");
        	   return "login";
           }
        	   
		//Convert Command class obj to DTO class obj
		 dto=new UserDTO();
		 BeanUtils.copyProperties(cmd,dto);
		//use Service
		 result=service.authenticate(dto);
		 //add result to Model Attrbute
		 map.put("result",result);
		 return "login";
	}//processForm(-,-)
}
