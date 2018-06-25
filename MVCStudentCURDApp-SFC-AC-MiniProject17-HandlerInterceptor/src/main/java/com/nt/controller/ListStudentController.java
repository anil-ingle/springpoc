package com.nt.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.nt.dto.StudentDTO;
import com.nt.service.StudentService;

public class ListStudentController extends AbstractController {
	private StudentService service;
	
	 public void setService(StudentService service) {
		this.service = service;
	}

	@Override
	public ModelAndView handleRequestInternal(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		List<StudentDTO> listDTO=null;
		ModelAndView mav=null;
		//use Service
		listDTO=service.fetchAllStudents();
		//create and MAV
		mav=new ModelAndView();
		mav.addObject("studList",listDTO);
		mav.setViewName("list_students");
		return mav;
	}//method
}//class
