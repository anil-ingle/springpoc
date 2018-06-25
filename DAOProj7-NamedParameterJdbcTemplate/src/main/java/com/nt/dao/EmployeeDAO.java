package com.nt.dao;

import com.nt.bo.EmployeeBO;

public interface EmployeeDAO {
	public String getEmployeeNameByNo(int no);
	public EmployeeBO getEmployeeDetailsByNo(int no);
	public int insert(EmployeeBO bo);

}
