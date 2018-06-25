package com.nt.dao;

import javax.annotation.Resource;
import javax.inject.Named;

import org.springframework.jdbc.core.JdbcTemplate;

import com.nt.bo.UserBO;

@Named("loginDAO")
public class LoginDAOImpl implements LoginDAO {
  private static final String AUTH_QUERY="SELECT COUNT(*) FROM USERLIST WHERE UNAME=? AND PWD=?";
	@Resource
	private JdbcTemplate jt;
	
	
	@Override
	public int validate(UserBO bo) {
		int count=0;
		//execute queru
		count=jt.queryForObject(AUTH_QUERY,Integer.class,bo.getUser(),bo.getPwd());
		return count;
	}
	

}
