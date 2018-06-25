package com.nt.dao;

import com.nt.bo.CustomerBO;
import com.nt.bo.StudentBO;

public interface StudentCustomerDAO {
	public void insertStudent(StudentBO bo);
	public void insertCustomer(CustomerBO bo);

}
