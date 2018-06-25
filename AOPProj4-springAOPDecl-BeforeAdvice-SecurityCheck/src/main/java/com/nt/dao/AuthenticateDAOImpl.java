package com.nt.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.nt.bo.UserDetailsBO;

public class AuthenticateDAOImpl implements AuthenticateDAO {
	private static final String AUTH_QUERY="SELECT COUNT(*) FROM USERLIST WHERE UNAME=? AND PWD=?";
	private JdbcTemplate jt;
	
	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}

	@Override
	public int authenticate(UserDetailsBO detailsBO) {
		int count=0;
		count=jt.queryForObject(AUTH_QUERY, Integer.class, detailsBO.getUserName(),detailsBO.getPassword());

		return count;
	}
}//class
