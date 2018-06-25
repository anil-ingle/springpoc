package com.nt.service;

import com.nt.bo.CustomerBO;
import com.nt.bo.StudentBO;
import com.nt.dao.StudentCustomerDAO;

public abstract class StudentCustomerService {
	private StudentCustomerDAO dao;
	
	public StudentCustomerService() {
		System.out.println("Service:0-param consturctor");
	}
	
	public void setDao(StudentCustomerDAO dao) {
		this.dao = dao;
	}
	public abstract StudentBO getStudentBO();
	public abstract CustomerBO getCustomerBO();
	
	public void processStudent(int no,String name,String course){
		StudentBO bo=null;
		//get StudentBO
		bo=getStudentBO();
		bo.setId(no);
		bo.setName(name);
		bo.setCourse(course);
		//use DAO
		dao.insertStudent(bo);
		
	}//method
	
    public void processCustomer(int no,String name,float billAmt){
    	CustomerBO bo=null;
    	//get CustomerBO
    	bo=getCustomerBO();
    	bo.setId(no);
    	bo.setName(name);
    	bo.setBillAmt(billAmt);
    	//use DAO
    	dao.insertCustomer(bo);
	}//method
}//class
