package com.nt.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.bo.StudentBO;
import com.nt.dao.StudentDAO;
import com.nt.dto.StudentDTO;

@Service("stService")
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentDAO dao;

	@Override
	public StudentDTO findStudentByNO(int no) {
		StudentDTO dto=null;
		StudentBO bo=null;
		//use DAO
		bo=dao.getStudentByNo(no);
		//Convert BO to DTO
		dto=new  StudentDTO();
		BeanUtils.copyProperties(bo,dto);
		return dto;
	}

	@Override
	public List<StudentDTO> findStudentsByAddrs(String addrs) {
		List<StudentBO> listBO=null;
		List<StudentDTO> listDTO=null;
		StudentDTO dto=null;
		
		//use DAO
		listBO=dao.getStudentsByAddrs(addrs);
		//copy ListBO to ListDTO
		listDTO=new ArrayList();
		for(StudentBO bo:listBO){
			dto=new StudentDTO();
			BeanUtils.copyProperties(bo,dto);
			listDTO.add(dto);
		}//for
		return listDTO; 
	}//method
	
	@Override
	public String modifyStudentDetailsByNo(String newName, String newAddrs, int no) {
		int count=0;
		//use DAO
		count=dao.updateStudentDetailsByNo(no, newName, newAddrs);
		if(count==0)
			return no+" student details are not updated";
		else
			return no+" student details are  updated";
	}
}//class
