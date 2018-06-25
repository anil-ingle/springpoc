package com.nt.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dao.EmployeeSearchDAO;

@Service("empService")
public class EmployeeSearchServiceImpl implements EmployeeSearchService {
	@Autowired
	private EmployeeSearchDAO dao; 


	@Override
	public List<Map<String, Object>> findEmpsByDesg(String[] desg) {
		String cond=null;
		List<Map<String,Object>>  list=null;
		//Convert desg[] into condition as required for the SQL Query
		cond="(";
		for(int i=0;i<desg.length;++i){
			if(i==desg.length-1)
				cond=cond+"'"+desg[i]+"')";
			else
				cond=cond+"'"+desg[i]+"',";
		}
		//use DAO class
		list=dao.searchEmpsByDesg(cond);
		return list;
	}

}
