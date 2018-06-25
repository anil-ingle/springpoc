package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Service;

import com.nt.bo.StudentBO;
import com.nt.dao.StudentDAO;
import com.nt.dto.StudentDTO;

@Service("stService")
@DependsOn("stDAO")
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentDAO dao;


	@Override
	public String generateResult(StudentDTO dto)throws Exception {
		int total=0;
		float avg=0.0f;
		String result=null;
		StudentBO bo=null;
		int count=0;
		//write b.logic
		total=dto.getM1()+dto.getM2()+dto.getM3();
		avg=total/3.0f;
		if(avg<35)
			result=dto.getSno()+" Student failed";
		else
			result=dto.getSno()+" student passed";
		//prepare BO
		bo=new StudentBO();
		bo.setSno(dto.getSno());
		bo.setSname(dto.getSname());
		bo.setTotal(total);
		bo.setAvg(avg);
		bo.setResult(result);
		//use DAO
		count=dao.insert(bo);
		if(count==0)
   		   return result+"---->registration failed";
		else
			return result+"---->registraion succeded";
	}//method
}//class
