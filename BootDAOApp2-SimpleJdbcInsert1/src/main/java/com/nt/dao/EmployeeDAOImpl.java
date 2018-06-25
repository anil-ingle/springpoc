package com.nt.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import com.nt.bo.EmployeeBO;

@Repository("empDAO")
public class EmployeeDAOImpl implements EmployeeDAO {
    
	@Autowired
	private SimpleJdbcInsert sji;
	
	
	
	@Override
	public int insert(EmployeeBO bo) {
		BeanPropertySqlParameterSource bpsps=null;
		System.out.println(sji.getJdbcTemplate().getDataSource().getClass());
		int count=0;
	   //set table name
		sji.setTableName("emp");
	  //prepare Col names and col values 
		bpsps=new BeanPropertySqlParameterSource(bo);
       //execute SQL query 		
		count=sji.execute(bpsps);
		//process the result
		return count;
	}//method
}//class
