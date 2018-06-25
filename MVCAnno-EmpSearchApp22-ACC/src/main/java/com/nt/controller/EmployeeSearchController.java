package com.nt.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nt.command.SearchCommand;
import com.nt.dto.SearchDTO;
import com.nt.dto.SearchResultDTO;
import com.nt.service.EmployeeSearchService;

@Controller
public class EmployeeSearchController {
	@Autowired
	private EmployeeSearchService service; 

	@RequestMapping("/performsearch.htm")
	public String search(Map<String,Object>map,@ModelAttribute SearchCommand command){
		SearchDTO dto=null;
		List<SearchResultDTO> listRDTO=null;
		//Convert Command obj DTO class obj
		dto=new SearchDTO();
		BeanUtils.copyProperties(command,dto);
		// use Servie classs
		listRDTO=service.findEmployees(dto);
		//Keep listRDTO in Map object
		map.put("empList",listRDTO);
		//return  LVN
		return "list_emps";
   	}

}
