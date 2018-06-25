package com.nt.dao;

import java.util.List;
import java.util.Map;

public interface EmployeeSearchDAO {
	
	public  List<Map<String,Object>> searchEmpsByDesg(String cond); 

}
