package com.nt.beans;

import java.util.Date;

public class Department {
	private int deptNo;
	private String deptName;
	private String deptLoc;
	private Date startDate;
	
	public Department(int deptNo, String deptName, String deptLoc, Date startDate) {
		System.out.println("Department:::4-param constructor");
		this.deptNo = deptNo;
		this.deptName = deptName;
		this.deptLoc = deptLoc;
		this.startDate = startDate;
	}

	@Override
	public String toString() {
		return "Department [deptNo=" + deptNo + ", deptName=" + deptName + ", deptLoc=" + deptLoc + ", startDate="
				+ startDate + "]";
	}
	
	

}
