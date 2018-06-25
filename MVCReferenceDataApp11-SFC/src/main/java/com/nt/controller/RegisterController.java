package com.nt.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

public class RegisterController extends SimpleFormController {

	@Override
	public Map<String,List<String>> referenceData(HttpServletRequest request) throws Exception {
		System.out.println("RegisterController:referenceData(-)");
		Map<String,List<String>> map=null;
		List<String> countries;
		List<String>  hobies;
		List<String>  courses;
		map=new HashMap();
		//prepare coutries
		countries=new ArrayList();
		countries.add("india");countries.add("pak"); countries.add("ban");
		countries.add("nepal"); countries.add("singapore");
		//prepare courses
		courses=new ArrayList();
		courses.add("java"); courses.add(".net"); courses.add("oracle");
		 courses.add("hadoop");
		//prepare hobies
		hobies=new ArrayList();
		hobies.add("reading books"); hobies.add("sleeping");
		hobies.add("chatting"); hobies.add("gossing");
		
		//add to them map collection to make as additional data to get useed in form page
		 map.put("countriesList",countries);
		 map.put("coursesList", courses);
		 map.put("hobiesList", hobies);
		return map;
	}//rerenceData(-,-)
	
	@Override
	public ModelAndView onSubmit(Object command, BindException errors) throws Exception {
		  ModelAndView mav=null;
     //create and return MAV
		   mav=new ModelAndView();
		   mav.setViewName("result_register");
		   mav.addObject("cmdData",command);
		   return mav;
		
	}
}//class
