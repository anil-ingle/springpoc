package com.nt.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.bo.EmployeeBO;
import com.nt.dao.EmployeeDAO;
import com.nt.dto.EmployeeDTO;

@Service("empService")
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
   private  EmployeeDAO dao;
	
	@Override
	public String register(EmployeeDTO dto) {
		EmployeeBO bo=null;
		int count=0;
		 //convert DTO to BO
		bo=new EmployeeBO();
		BeanUtils.copyProperties(dto,bo);
		//use DAO
		count=dao.insert(bo);
        if(count==0)		
		  return "Registration failed";
        else
         return "Registration succeded";
	}//register(-)
 }//class
