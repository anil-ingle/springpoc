package com.nt.dao;

import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeSearchDAOImpl implements EmployeeSearchDAO {
	private JdbcTemplate jt;

	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}

	@Override
	public List<Map<String, Object>> searchEmpsByDesg(String cond) {
		List<Map<String,Object>> list=null;
		//execute Query
		list=jt.queryForList("SELECT EMPNO,ENAME,JOB,SAL FROM EMP WHERE JOB IN "+cond+" ORDER BY JOB");
		return list;
	}

}
