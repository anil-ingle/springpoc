package com.nt.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.BeanUtils;
import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractCommandController;

import com.nt.command.SearchCommand;
import com.nt.dto.SearchDTO;
import com.nt.dto.SearchResultDTO;
import com.nt.service.EmployeeSearchService;

public class EmployeeSearchController extends AbstractCommandController {
	
	private EmployeeSearchService service;
	
	 public void setService(EmployeeSearchService service) {
			this.service = service;
		}


	@Override
	public ModelAndView handle(HttpServletRequest req, HttpServletResponse res, Object cmd, BindException errors)
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
		mav=new ModelAndView();
		mav.setViewName("listEmps");
		mav.addObject("searchList",listRDTO);
		return mav;
	}

	
}
