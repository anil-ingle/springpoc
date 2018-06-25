package com.nt.beans;

public class Student {
	private String sname;
	private HallTicket htDetails;
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public HallTicket getHtDetails() {
		return htDetails;
	}
	public void setHtDetails(HallTicket htDetails) {
		this.htDetails = htDetails;
	}
	
	public String writeExam(){
		return sname+" with "+htDetails+ " is allowed to write exam ";
	}

}
