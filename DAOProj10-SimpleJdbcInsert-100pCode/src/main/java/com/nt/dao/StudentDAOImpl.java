package com.nt.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import com.nt.bo.StudentBO;

@Repository("stDAO")
public class StudentDAOImpl implements StudentDAO {
	@Autowired
	private SimpleJdbcInsert sji;

	
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
