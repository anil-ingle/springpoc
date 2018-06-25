package com.nt.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.nt.bo.EmployeeBO;
import com.nt.dao.EmployeeDAO;
import com.nt.dto.EmployeeDTO;

public class EmployeeServiceImpl implements EmployeeService {
	
	private  EmployeeDAO dao;
	
	public void setDao(EmployeeDAO dao) {
		this.dao = dao;
	}//method

	@Override
	public EmployeeDTO searchEmployeeDetailsByNo(int no) {
		EmployeeDTO dto=null;
		EmployeeBO bo=null;
	    //use DAO 
		bo=dao.getEmpDetailsByNo(no);
		//convert BO into DTO
         dto=new EmployeeDTO();		
		BeanUtils.copyProperties(bo,dto);
		return dto;
	}//method
	
	
	@Override
	public List<EmployeeDTO> searchEmployeeDetailsByDesg(String desg) {
		List<EmployeeDTO> listDTO=null;
		List<EmployeeBO> listBO=null;
		EmployeeDTO dto=null;
		//use DAO
		listBO=dao.getEmployeeDetailsByDesg(desg);
		//convert listBO to listDTO;
		listDTO=new ArrayList();
		
		for(EmployeeBO bo:listBO){
     		dto=new EmployeeDTO();
		 BeanUtils.copyProperties(bo,dto);
		 listDTO.add(dto);
		}
		return listDTO;
	}//method

}//class
