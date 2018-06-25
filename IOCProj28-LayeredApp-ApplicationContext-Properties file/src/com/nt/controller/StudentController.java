package com.nt.controller;

import com.nt.dto.StudentDTO;
import com.nt.service.StudentService;
import com.nt.vo.StudentVO;

public class StudentController {
	private StudentService service;
	
	public void setService(StudentService service) {
		this.service = service;
	}

	public String processStudentInfo(String sno,String sname,String m1,String m2,String m3)throws Exception{
		 StudentVO vo=null;
		 StudentDTO dto=null;
		 String result=null;
      //preapre VO class obj  having inputs
		vo=new StudentVO();
		vo.setSno(sno);
		vo.setSname(sname);
		vo.setM1(m1);
		vo.setM2(m2);
		vo.setM3(m3);
		//Covert VO class obj to DTO class obj
		dto=new StudentDTO();
		dto.setSno(Integer.parseInt(vo.getSno()));
		dto.setSname(vo.getSname());
		dto.setM1(Math.round(Float.parseFloat(vo.getM1())));
		dto.setM2(Math.round(Float.parseFloat(vo.getM2())));
		dto.setM3(Math.round(Float.parseFloat(vo.getM3())));
		//use Service
		result=service.generateResult(dto);
		return result;
	}//processStudentInfo(....)

}//class
