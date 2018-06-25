package com.nt.dao;

import java.util.List;
import java.util.Map;

public interface EmployeeDAO {
   public int insert(int empno,String ename,int salary,String desg);
   public int getEmployeesCount();
   public Map<String,Object> getEmployeeDetailsByNo(int no);
   public List<Map<String,Object>> getEmployeeDetailsByDesg(String desg);
   public int getEmployeeSalaryByNo(int no);
   public int updateEmployeeSalary(int no,float newSalary);
   public int deleteEmpByNo(int no);
}
