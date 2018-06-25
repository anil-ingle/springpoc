package com.nt.dao;

import com.nt.bo.CustomerBO;
import com.nt.bo.StudentBO;

public class StudentCustomerDAOImpl implements StudentCustomerDAO {

	@Override
	public void insertStudent(StudentBO bo) {
		System.out.println("Inserting student Data::::"+bo);
	}

	@Override
	public void insertCustomer(CustomerBO bo) {
		System.out.println("Inserting Cuostomer Data::::"+bo);
	}

}
