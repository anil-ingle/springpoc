package com.nt.dao;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository("empDAO")
public class EmployeeSearchDAOImpl implements EmployeeSearchDAO {
	@Autowired
	private JdbcTemplate jt;

	

	@Override
	public List<Map<String, Object>> searchEmpsByDesg(String cond) {
		List<Map<String,Object>> list=null;
		//execute Query
		list=jt.queryForList("SELECT EMPNO,ENAME,JOB,SAL FROM EMP WHERE JOB IN "+cond+" ORDER BY JOB");
		return list;
	}

}
