package com.nt.beans;

public class StudentDetails {
	private int sno;
	
	private String sname;
	private String sadd;
	
	public StudentDetails(int sno, String sname, String sadd) {
		this.sno = sno;
		this.sname = sname;
		this.sadd = sadd;
	}
	
	public StudentDetails(int sno, String sname ) {
		this.sno = sno;
		this.sname = sname;
	}
	
	public StudentDetails(int sno){
		this.sno = sno;
	}
	public StudentDetails(String sname){
		this.sname = sname;
	}

	
	
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSadd() {
		return sadd;
	}
	public void setSadd(String sadd) {
		this.sadd = sadd;
	}
	@Override
	public String toString() {
		return "StduentDetails [sno=" + sno + ", sname=" + sname + ", sadd=" + sadd + "]";
	}
	

}
