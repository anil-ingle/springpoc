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
public class EditStudentController extends SimpleFormController {
  private StudentService service;
  
	public void setService(StudentService service) {
	this.service = service;
}

	@Override
	public Object formBackingObject(HttpServletRequest request) throws Exception {
		int no=0;
		StudentDTO dto=null;
		 StudentCommand cmd=null;
		//read student no from edit hyperlink "sid"
		no=Integer.parseInt(request.getParameter("sid"));
		//use Service
		dto=service.fetchStudentByNo(no);
		//create Command obj having DTO class obj data
		cmd=new StudentCommand();
		BeanUtils.copyProperties(dto,cmd);
		return cmd;
	}
	
	@Override
		public ModelAndView onSubmit(HttpServletRequest request, HttpServletResponse response, Object command,
				BindException errors) throws Exception {
		StudentCommand cmd=null;
		StudentDTO dto=null;
		String edit_result=null;
		ModelAndView mav=null;
		List<StudentDTO> listDTO=null;
		//typecasting
		cmd=(StudentCommand)command;
		//Convert Command obj to DTO object
		dto=new StudentDTO();
		BeanUtils.copyProperties(cmd,dto);
		//use service
		edit_result=service.modifyStudentByNo(dto);
		listDTO=service.fetchAllStudents();
		//create and Return MAV
		mav=new ModelAndView();
		mav.setViewName("list_students");
		mav.addObject("studList",listDTO);
		mav.addObject("edit_result",edit_result);
		return mav;
		}//method
}//class
