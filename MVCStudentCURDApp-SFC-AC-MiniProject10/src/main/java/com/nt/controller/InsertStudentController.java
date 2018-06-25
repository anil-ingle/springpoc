package com.nt.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.BeanUtils;
import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.nt.command.StudentCommand;
import com.nt.dto.StudentDTO;
import com.nt.service.StudentService;

public class InsertStudentController extends SimpleFormController {

	private StudentService service;
	
	   public void setService(StudentService service) {
			this.service = service;
		}
	   
	   @Override
	public Object formBackingObject(HttpServletRequest request) throws Exception {
		   int sno=0;
		   StudentCommand cmd=null;
		   //use serivce
		   sno=service.fetchStudentNumber();
		   //create and return Commadn obj
		   cmd=new StudentCommand();
		   cmd.setSno(sno);
		   return cmd;
		   
		   
	}
	   
	   @Override
	public ModelAndView onSubmit(HttpServletRequest request, HttpServletResponse response, Object cmd,
			BindException errors) throws Exception {
		   StudentDTO dto=null;
		   StudentCommand stCommand=null;
		   String result=null;
		   ModelAndView mav=null;
		   List<StudentDTO> listDTO=null;
		   stCommand=(StudentCommand)cmd;
		   
		   
		   //Convert Command obj DTO obj
		   dto=new StudentDTO();
		   BeanUtils.copyProperties(stCommand,dto);
		   //use SErvice class
		   result=service.registerStudent(dto);
		   listDTO=service.fetchAllStudents();
		   //create and return MAV
		   mav=new ModelAndView();
		   mav.addObject("insert_result",result);
		   mav.addObject("studList",listDTO);
		   mav.setViewName("list_students");
		   mav.addObject("stCmd",stCommand);
		   return mav;
	}
}
