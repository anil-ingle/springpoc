package com.nt.beans;

public class Student {
	private int sno;
	private String sname;
	private float avg;
	
	public Student(int sno, String sname, float avg) {
		System.out.println("Student:3-param cosntructor");
		this.sno = sno;
		this.sname = sname;
		this.avg = avg;
	}

	@Override
	public String toString() {
		return "Student [sno=" + sno + ", sname=" + sname + ", avg=" + avg + "]";
	}
	
	

}
