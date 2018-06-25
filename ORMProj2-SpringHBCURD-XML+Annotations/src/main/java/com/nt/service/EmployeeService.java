package com.nt.service;

import java.util.List;

import com.nt.dto.EmployeeDTO;

public interface EmployeeService {
	public String registerEmployee(EmployeeDTO dto);
	public List<EmployeeDTO> fetchAllEmployees();
	public  String modifyEmailByNo(int no,String newEmail);
	public  String removeEmployeeByLastName(String surName);
	public  List<EmployeeDTO> fetchEmployeesByEmailDomain(String domain);
	public List<EmployeeDTO> fetchEmployeesByLastName(String surname1,String surname2,String surname3);
}
