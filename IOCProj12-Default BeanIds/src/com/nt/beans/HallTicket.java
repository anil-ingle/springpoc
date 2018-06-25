package com.nt.beans;

public class HallTicket {
	private int rollNo;
	private String college;
	private String course;
	
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "HallTicket [rollNo=" + rollNo + ", college=" + college + ", course=" + course + "]";
	}
	
	

}
