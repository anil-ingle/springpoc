package com.nt.service;

import java.util.List;

import com.nt.dto.EmployeeDTO;

public interface EmployeeService {
	public EmployeeDTO searchEmployeeDetailsByNo(int no);
	public List<EmployeeDTO> searchEmployeeDetailsByDesg(String desg);

}
