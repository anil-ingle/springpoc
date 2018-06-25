package com.nt.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.nt.bo.StudentBO;

public class StudentInsertDAOImpl implements StudentInsertDAO {
    private static final String STUDENT_INSERT_QUERY="INSERT INTO STUDENT VALUES(?,?,?)";
	private JdbcTemplate jt;
   
	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}

	@Override
	public int insert(StudentBO bo) {
	  int count=0;
	  count=jt.update(STUDENT_INSERT_QUERY, bo.getSno(),bo.getSname(),bo.getSadd());
     return count;			  
	}

}
