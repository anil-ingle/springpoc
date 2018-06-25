package com.nt.service;

import com.nt.dto.EmployeeDTO;

public interface EmployeeService {
	public String findEmployeeNameByNo(int no);
	public EmployeeDTO findEmployeeByNo(int no);
	public String registerEmp(EmployeeDTO dto);

}
