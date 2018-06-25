package com.nt.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.BeanUtils;
import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.nt.command.StudentCommand;
import com.nt.dto.StudentDTO;
import com.nt.service.StudentInsertService;

public class StudentInsertController extends SimpleFormController {
 

	private StudentInsertService service;
	
	   public void setService(StudentInsertService service) {
			this.service = service;
		}
	   
	   @Override
	public ModelAndView onSubmit(HttpServletRequest request, HttpServletResponse response, Object cmd,
			BindException errors) throws Exception {
		   StudentDTO dto=null;
		   StudentCommand stCommand=null;
		   String result=null;
		   ModelAndView mav=null;
		   stCommand=(StudentCommand)cmd;
		   
		   //Convert Command obj DTO obj
		   dto=new StudentDTO();
		   BeanUtils.copyProperties(stCommand,dto);
		   //use SErvice class
		   result=service.register(dto);
		   //create and return MAV
		   mav=new ModelAndView();
		   mav.addObject("resultMsg",result);
		   //mav.setViewName(this.getSuccessView());
		   mav.setViewName("student");
		   mav.addObject("stCmd",stCommand);
		   return mav;
		   
		   
	}
}
