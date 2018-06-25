package com.nt.dao;

import java.util.List;

import com.nt.domain.EmployeeHLO;

public interface EmployeeDAO {
	
	public  int insert(EmployeeHLO hlo);
	public  List<EmployeeHLO> getAllEmployees();
	public int updateEmployeeEmail(int eid,String newEmail);
	public int  deleteEmployeeByLastName(String surName);
	public List<EmployeeHLO> getEmployeesByEmailDomain(String domain);
	public List<EmployeeHLO> getEmployeesByLastName(String surName1,String SurName2,String surName3);

}
