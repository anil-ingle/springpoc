package com.nt.dao;

import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;

import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

import com.nt.bo.EmployeeBO;

public class EmployeeDAOImpl implements EmployeeDAO {
	private static final String GET_EMP_NAME_BY_NO="SELECT ENAME FROM EMP WHERE EMPNO=:id";
	private static final String GET_EMP_DETAILS_BY_NO="SELECT EMPNO,ENAME,JOB,SAL FROM EMP WHERE EMPNO=:id";
	private static final String EMP_INSERT="INSERT INTO EMP(EMPNO,ENAME,JOB,SAL) VALUES(:eno,:ename,:desg,:salary)";
	
	private NamedParameterJdbcTemplate npjt;

	public void setNpjt(NamedParameterJdbcTemplate npjt) {
		this.npjt = npjt;
	}

	public String getEmployeeNameByNo(int no) {
		String name=null;
		Map<String,Object> paramMap=null;
		//prepare param values
		paramMap=new HashMap();
		paramMap.put("id",no);
		//execute the Query
		name=npjt.queryForObject(GET_EMP_NAME_BY_NO, paramMap, String.class);
		return name;
	}

	public EmployeeBO getEmployeeDetailsByNo(int no) {
		MapSqlParameterSource paramSource=null;
		EmployeeBO bo=null;
		//prepare param names & values
		paramSource=new MapSqlParameterSource();
		paramSource.addValue("id",no);
		//execute query
		bo=npjt.queryForObject(GET_EMP_DETAILS_BY_NO, paramSource,
				               (ResultSet rs,int index)->{
				            	   EmployeeBO ebo=null;
				            	   ebo=new EmployeeBO();
				            	   ebo.setEno(rs.getInt(1));
				            	   ebo.setEname(rs.getString(2));
				            	   ebo.setDesg(rs.getString(3));
				            	   ebo.setSalary(rs.getInt(4));
				            	   return ebo;
	   		               });
		
		return bo;
	}

	public int insert(EmployeeBO bo) {
		BeanPropertySqlParameterSource bpsps=null;
		int result=0;
		//prepare param names and values
		bpsps=new BeanPropertySqlParameterSource(bo);
		//eexeute the query
		result=npjt.update(EMP_INSERT, bpsps);
		return result;
	}

}
