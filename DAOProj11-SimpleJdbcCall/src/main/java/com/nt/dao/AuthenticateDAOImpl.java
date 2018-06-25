package com.nt.dao;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.inject.Named;

import org.springframework.jdbc.core.simple.SimpleJdbcCall;

@Named("authDAO")
public class AuthenticateDAOImpl implements AuthenticateDAO {
	@Resource
	private SimpleJdbcCall sjc;

	@Override
	public String authenticate(String user, String pwd) {
		Map<String,Object> inParams=null;
		Map<String,Object> outParams=null;
		//prepare Map of IN param names and values 
		inParams=new HashMap<String,Object>();
		inParams.put("user",user);
		inParams.put("pass",pwd);
		//set Procedure name
		sjc.setProcedureName("PRO_AUTHENTICATE");
		//execute PL/SQL procedure
		outParams=sjc.execute(inParams);
		//get result value..
		return (String)outParams.get("RESULT");
	}

}
