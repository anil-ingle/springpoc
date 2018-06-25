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
		   
		   //Application Logic Error
		   if(stCommand.getSadd().equals("delhi")){
			   errors.rejectValue("sadd","sadd.restrictarea");
			   return showForm(request,errors,"student");
		   }
		   
		   //Convert Command obj DTO obj
		   dto=new StudentDTO();
		   BeanUtils.copyProperties(stCommand,dto);
		   //use SErvice class
		   result=service.register(dto);
		   //create and return MAV
		   mav=new ModelAndView();
		   mav.addObject("resultMsg",result);
		   mav.setViewName(this.getSuccessView());
		   //mav.setViewName("student");
		   mav.addObject("stCmd",stCommand);
		   return mav;
	}
	 @Override
	public ModelAndView handleInvalidSubmit(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		 System.out.println("handleInvalidSubmit(-,-)");
		 return new ModelAndView("dbl_post");
	}  
	 
	@Override
	public Object formBackingObject(HttpServletRequest request) throws Exception {
		  System.out.println("formBackingObject(-)");
		  StudentCommand cmd=null;
		  cmd=new StudentCommand();
		  cmd.setSno(111);
		  cmd.setSname("ramesh");
		  cmd.setSadd("vizag");
		  return cmd;
	} 
	   
}
