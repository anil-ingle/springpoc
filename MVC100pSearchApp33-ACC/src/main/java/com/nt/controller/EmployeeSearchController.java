package com.nt.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.nt.command.SearchCommand;
import com.nt.dto.SearchDTO;
import com.nt.dto.SearchResultDTO;
import com.nt.service.EmployeeSearchService;

@Controller
public class EmployeeSearchController {
	
	@Autowired
	private EmployeeSearchService service;
	
	@RequestMapping("/search.htm")
	public String showHomePage(){
		return "search";
	}
	

	@RequestMapping("/searchEmps.htm")
	public String search(Map<String,Object> map,@ModelAttribute("searchCmd")SearchCommand cmd)
			throws Exception {
		SearchCommand command=null;
		SearchDTO dto=null;
		List<SearchResultDTO> listRDTO=null;
		ModelAndView mav=null;
		//type casting
		command=(SearchCommand)cmd;
		//Convert Command class obj to DTO class object
		dto=new SearchDTO();
		BeanUtils.copyProperties(command,dto);
		// use Service class
		listRDTO=service.findEmployees(dto);
		//create and return MAV
		map.put("searchList",listRDTO);
		return "list_emps";
	}

	
}
