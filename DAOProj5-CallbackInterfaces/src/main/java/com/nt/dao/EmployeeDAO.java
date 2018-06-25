package com.nt.dao;

import java.util.List;

import com.nt.bo.EmployeeBO;
import com.nt.dto.EmployeeDTO;

public interface EmployeeDAO {
	public EmployeeBO getEmpDetailsByNo(int no);
	public List<EmployeeBO> getEmployeeDetailsByDesg(String desg);

}
