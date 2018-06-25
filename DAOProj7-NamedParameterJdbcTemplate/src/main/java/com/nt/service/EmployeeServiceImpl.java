package com.nt.service;

import org.springframework.beans.BeanUtils;

import com.nt.bo.EmployeeBO;
import com.nt.dao.EmployeeDAO;
import com.nt.dto.EmployeeDTO;

public class EmployeeServiceImpl implements EmployeeService {
	
   private EmployeeDAO dao;	

	public void setDao(EmployeeDAO dao) {
	this.dao = dao;
    }

	@Override
	public String findEmployeeNameByNo(int no) {
		String name=null;
		//use DAO
		name=dao.getEmployeeNameByNo(no);
		return name;
	}

	@Override
	public EmployeeDTO findEmployeeByNo(int no) {
		EmployeeBO bo=null;
		EmployeeDTO dto=null;
		//use DAO
		bo=dao.getEmployeeDetailsByNo(no);
		//convert BO to DTO
		dto=new EmployeeDTO();
		BeanUtils.copyProperties(bo,dto);
		return dto;
	}

	@Override
	public String registerEmp(EmployeeDTO dto) {
		EmployeeBO bo=null;
		int count=0;
	    //convert DTO to BO
		bo=new EmployeeBO();
		BeanUtils.copyProperties(dto,bo);
		//use DAO
		count=dao.insert(bo);
		if(count==0)
			return "employee registration failed";
		else
			return "employee registration succeded";
	}//method
}//class
