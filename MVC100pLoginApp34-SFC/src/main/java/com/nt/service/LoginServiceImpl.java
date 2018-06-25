package com.nt.service;

import javax.annotation.Resource;
import javax.inject.Named;

import org.springframework.beans.BeanUtils;
import org.springframework.transaction.annotation.Transactional;

import com.nt.bo.UserBO;
import com.nt.dao.LoginDAO;
import com.nt.dto.UserDTO;

@Named("loginService")
public class LoginServiceImpl implements LoginService {
	
	@Resource
	private LoginDAO dao;

	@Override
	@Transactional(transactionManager="dsTxMgmr")
	public String validate(UserDTO dto) {
		UserBO bo=null;
		int count=0;
		//Convert dto to BO
		bo=new UserBO();
		BeanUtils.copyProperties(dto,bo);
		
	   //use DAO	
		count=dao.validate(bo);
		if(count==0)
		  return "InValid Credentials";
		else
			return "Valid Credentials";	
	}

}
