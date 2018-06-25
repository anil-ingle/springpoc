package com.nt.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;

import com.nt.bo.StudentBO;

public class StudentDAOImpl implements StudentDAO {
	private SimpleJdbcInsert sji;

	public void setSji(SimpleJdbcInsert sji) {
		this.sji = sji;
	}

	/*@Override
	public int insert(StudentBO bo) {
		int count=0;
		Map<String,Object> mapColValues;
		//set table name
		sji.setTableName("student");
		//prepare col names and values as Map object
		mapColValues=new HashMap();
		mapColValues.put("SNO",bo.getSno());
		mapColValues.put("sname",bo.getSname());
		mapColValues.put("SADD",bo.getSadd());
		//execute query that is generated dynamically
		count=sji.execute(mapColValues);
		return count;
	}//method
	*/
	
	@Override
	public int insert(StudentBO bo) {
		int count=0;
		BeanPropertySqlParameterSource bpsps=null;
		//set table name
		sji.setTableName("student");
		//prepare BeanPropertySqlParmaeterSource class object
		bpsps=new BeanPropertySqlParameterSource(bo);
		//execute query that is generated dynamically
		count=sji.execute(bpsps);
		return count;
	}//method
	
}//class
