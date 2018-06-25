package com.nt.service;

import java.util.List;

import com.nt.dto.StudentDTO;

public interface StudentService {
	public StudentDTO  findStudentByNO(int no);
	public List<StudentDTO> findStudentsByAddrs(String addrs);
	public String modifyStudentDetailsByNo(String newName,String newAddrs,int no);

}
