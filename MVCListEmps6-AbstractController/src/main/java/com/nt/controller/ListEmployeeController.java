package com.nt.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.nt.dto.EmployeeDTO;
import com.nt.service.ListEmployeeService;

public class ListEmployeeController extends AbstractController {
	private ListEmployeeService service;

	public void setService(ListEmployeeService service) {
		this.service = service;
	}

	@Override
	public ModelAndView handleRequestInternal(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		List<EmployeeDTO> listDTO=null;
		ModelAndView mav=null;
		//use Service
		listDTO=service.getAllEmployess();
		System.out.println("controller"+listDTO.size());
		//create and return MAV
		mav=new ModelAndView();
		mav.setViewName("list_emps");
		mav.addObject("empList",listDTO);
		return mav;
	}

}
