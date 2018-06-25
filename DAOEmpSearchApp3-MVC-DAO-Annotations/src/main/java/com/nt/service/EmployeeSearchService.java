package com.nt.service;

import java.util.List;
import java.util.Map;

public interface EmployeeSearchService {
	 public List<Map<String,Object>> findEmpsByDesg(String desg[]);
   
}
