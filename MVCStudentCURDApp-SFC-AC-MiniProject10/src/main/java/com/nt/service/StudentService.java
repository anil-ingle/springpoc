package com.nt.service;

import java.util.List;

import com.nt.dto.StudentDTO;

public interface StudentService {
	public List<StudentDTO>  fetchAllStudents();
	public StudentDTO fetchStudentByNo(int no);
	public String modifyStudentByNo(StudentDTO dto);
	public String  registerStudent(StudentDTO dto);
	public int  fetchStudentNumber();

}
