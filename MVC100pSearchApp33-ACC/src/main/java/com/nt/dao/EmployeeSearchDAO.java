package com.nt.dao;

import java.util.List;

import com.nt.bo.SearchBO;
import com.nt.bo.SearchResultBO;

public interface EmployeeSearchDAO {
	
	public List<SearchResultBO> searchEmps(SearchBO bo);

}
