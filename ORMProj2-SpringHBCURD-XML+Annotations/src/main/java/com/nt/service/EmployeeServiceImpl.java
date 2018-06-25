package com.nt.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.nt.dao.EmployeeDAO;
import com.nt.domain.EmployeeHLO;
import com.nt.dto.EmployeeDTO;

@Service("empService")
@Transactional(propagation=Propagation.REQUIRED,readOnly=false)
public class EmployeeServiceImpl implements EmployeeService {
	 @Resource
	private EmployeeDAO dao;
	
	

	@Override
	public String registerEmployee(EmployeeDTO dto) {
		 EmployeeHLO hlo=null;
		 int result=0;
        //Convert DTO To BO
		 hlo=new EmployeeHLO();
		 BeanUtils.copyProperties(dto,hlo);
		 //use DAO
		 result=dao.insert(hlo);
		 if(result==0)
			 return "Registtration failed";
		 else
			 return "Employee Registred with Number:"+result;
	}//method

	@Override
	public List<EmployeeDTO> fetchAllEmployees() {
		 List<EmployeeDTO> listDTO=new ArrayList();
		List<EmployeeHLO> listHLO=null;
		
		//use DAO 
		listHLO=dao.getAllEmployees();
		//convert  listHLO to ListDTO
		listHLO.forEach(hlo->{
			EmployeeDTO dto=new EmployeeDTO();
			BeanUtils.copyProperties(hlo,dto);
			listDTO.add(dto);
		});
		return listDTO;
	}//method
	
	@Override
	public String modifyEmailByNo(int no, String newEmail) {
		int count=0;
		//use DAO
		count=dao.updateEmployeeEmail(no,newEmail);
		if(count==0)
			return "Record not updated";
		else
			return "Record updated";
	}//method
	
	@Override
	public String removeEmployeeByLastName(String surName) {
		int count=0;
		//use dAO
        count=dao.deleteEmployeeByLastName(surName);
        if(count==0)
        	return "Employee(s) Not Deleted";
        else
        	return "Employee(s) Deleted";
	}//method
	
	@Override
	public List<EmployeeDTO> fetchEmployeesByEmailDomain(String domain) {
		 List<EmployeeDTO> listDTO=new ArrayList();
			List<EmployeeHLO> listHLO=null;
			
			//use DAO 
			listHLO=dao.getEmployeesByEmailDomain(domain);
			//convert  listHLO to ListDTO
			listHLO.forEach(hlo->{
				EmployeeDTO dto=new EmployeeDTO();
				BeanUtils.copyProperties(hlo,dto);
				listDTO.add(dto);
			});
			return listDTO;
	}
	
	@Override
	public List<EmployeeDTO> fetchEmployeesByLastName(String surname1, String surname2, String surname3) {
		List<EmployeeDTO> listDTO=new ArrayList();
		List<EmployeeHLO> listHLO=null;
		
		//use DAO 
		listHLO=dao.getEmployeesByLastName(surname1, surname2, surname3);
		//convert  listHLO to ListDTO
		listHLO.forEach(hlo->{
			EmployeeDTO dto=new EmployeeDTO();
			BeanUtils.copyProperties(hlo,dto);
			listDTO.add(dto);
		});
		return listDTO;
	}//method
	
}//class
