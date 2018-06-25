package com.nt.service;

import org.springframework.beans.BeanUtils;

import com.nt.bo.StudentBO;
import com.nt.dao.StudentInsertDAO;
import com.nt.dto.StudentDTO;

public class StudentInsertServiceImpl implements StudentInsertService {
	
    private StudentInsertDAO dao;
	public void setDao(StudentInsertDAO dao) {
		this.dao = dao;
	}
	@Override
	public String register(StudentDTO dto) {
		StudentBO bo=null;
		int count=0;
		// Convert DTO to BO
		bo=new StudentBO();
		BeanUtils.copyProperties(dto,bo);
	   //use DAO
		count=dao.insert(bo);
		//generate result
		if(count==0)
			return "Student Registration Failed";
		else
			return "Student registration succeded"; 
	}//register(-)
}//class
