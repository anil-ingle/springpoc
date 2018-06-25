package com.nt.beans;

import java.beans.ConstructorProperties;

public class CollegeDetails {
	private int collegeId;
	private String collegeName;
	private String address;
	private float rating;
	
	//@ConstructorProperties(value={"collegeId","clgName","address","rating"})
	public CollegeDetails(int collegeId, String clgName, String address, float rating) {
		System.out.println("CollegeDetails:4 param constructor");
		this.collegeId = collegeId;
		this.collegeName = clgName;
		this.address = address;
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "CollegeDetails [collegeId=" + collegeId + ", collegeName=" + collegeName + ", address=" + address
				+ ", rating=" + rating + "]";
	}
}//class
