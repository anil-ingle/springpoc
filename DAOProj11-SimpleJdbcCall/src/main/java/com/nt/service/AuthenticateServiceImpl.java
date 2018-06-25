package com.nt.service;

import javax.annotation.Resource;
import javax.inject.Named;

import com.nt.dao.AuthenticateDAO;

@Named("authService")
public class AuthenticateServiceImpl implements AuthenticateService {
	  @Resource
	private AuthenticateDAO dao;

	@Override
	public String validate(String uname, String pwd) {
		String result=null;
		//use dao
		result=dao.authenticate(uname, pwd);
		return result;
	}//validate(-,-)
}//class
