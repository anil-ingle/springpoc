package com.nt.service;

import java.util.List;
import java.util.Map;

import com.nt.dao.EmployeeDAO;

public class EmployeeServiceImpl implements EmployeeService {
	
	private EmployeeDAO dao;

	public void setDao(EmployeeDAO dao) {
		this.dao = dao;
	}

	@Override
	public String RegisterEmployee(int no, String ename, String job, int salary) {
		int count=0;
		//use DAO
		count=dao.insert(no, ename, salary, job);
		if(count==0)
			return no+"  Employee is not registered";
		else
			return no+"  Employee is  registered";	
	}//method
	
	@Override
	public int findEmployeesCount() {
		int count=0;
		//use DAO
		count=dao.getEmployeesCount();
		return count;
	}//method
	
	@Override
	public Map<String, Object> listEmployeesByNo(int no) {
		Map<String,Object>map=null;
		//use DAO
		map=dao.getEmployeeDetailsByNo(no);
		return map;
	}//method
	
	@Override
	public List<Map<String, Object>> listEmployeesByDesg(String desg) {
		List<Map<String,Object>> list=null;
		//use dAO
		list=dao.getEmployeeDetailsByDesg(desg);
		return list;
	}//method
	
	@Override
	public int findEmpSalary(int no) {
		int salary=0;
		//use DAO
		salary=dao.getEmployeeSalaryByNo(no);
		return salary;
	}//method
	
	@Override
	public String hikeEmpSalary(int no, int percentage) {
		int salary=0;
		float newSalary=0;
		int count=0;
		//get Current salary
		salary=findEmpSalary(no);
		//hike salary
		newSalary=salary+(salary*percentage/100.0f);
		//use dAO
		count=dao.updateEmployeeSalary(no,newSalary);
		if(count==0)
			return no+" emp salary hicked with"+newSalary+" but not updated";
		else 
			return no+" emp salary hiked..new salary:"+newSalary+" and updated in DB ";
	}
	
	@Override
	public String fireEmployee(int no) {
		int count=0;
		//use DAO
	   count=dao.deleteEmpByNo(no);
	   if(count==0)
		return no+" Emp is not deleted";
	   else
		return no+" emp is deleted";   
	}//method
}//class
