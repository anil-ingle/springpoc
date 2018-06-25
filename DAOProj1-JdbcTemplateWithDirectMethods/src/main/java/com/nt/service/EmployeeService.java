package com.nt.service;

import java.util.List;
import java.util.Map;

public interface EmployeeService {
	
	public String  RegisterEmployee(int no,String ename,String job,int salary);
	public int  findEmployeesCount();
	public Map<String,Object> listEmployeesByNo(int no);
	public List<Map<String,Object>> listEmployeesByDesg(String desg);
	public int findEmpSalary(int no);
	public String hikeEmpSalary(int no,int percentage);
	public String fireEmployee(int no);
	

}
