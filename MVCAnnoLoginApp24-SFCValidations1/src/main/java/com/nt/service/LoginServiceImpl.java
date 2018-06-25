package com.nt.service;

import javax.annotation.Resource;
import javax.inject.Named;

import org.springframework.beans.BeanUtils;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.nt.bo.UserBO;
import com.nt.dao.LoginDAO;
import com.nt.dto.UserDTO;

@Named("LoginService")
public class LoginServiceImpl implements LoginService {
	@Resource
	private LoginDAO dao;

	@Override
	@Transactional(propagation=Propagation.REQUIRED,readOnly=true,transactionManager="dsTxMgmr")
	public String authenticate(UserDTO dto) {
		 UserBO bo=null;
		 int count=0;
		//convert dto to BO
		bo=new UserBO();
		BeanUtils.copyProperties(dto, bo);
		//use DAO
		count=dao.validate(bo);
		//process the result
		if(count==0)
		  return "Invalid Credentials";
		else
			return "Valid Credentials";	
	}//authenticate(-)

}//class
