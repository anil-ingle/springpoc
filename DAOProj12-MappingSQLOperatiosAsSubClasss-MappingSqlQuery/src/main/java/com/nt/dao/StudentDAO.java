package com.nt.dao;

import java.util.List;

import com.nt.bo.StudentBO;

public interface StudentDAO {
	public StudentBO getStudentByNo(int no); 
	public List<StudentBO> getStudentsByAddrs(String addrs);
	public int updateStudentDetailsByNo(int no,String newName,String newAddrs);
	

}
