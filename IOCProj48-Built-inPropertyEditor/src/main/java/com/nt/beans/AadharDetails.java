package com.nt.beans;

import java.io.File;
import java.util.Arrays;
import java.util.Date;

public class AadharDetails {
	private int uid;
	private String name;
	private Date dob;
	private String verifiers[];
	private File photoLocation;
	private float income;
	private long phoneNumber;
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String[] getVerifiers() {
		return verifiers;
	}
	public void setVerifiers(String[] verifiers) {
		this.verifiers = verifiers;
	}
	public File getPhotoLocation() {
		return photoLocation;
	}
	public void setPhotoLocation(File photoLocation) {
		this.photoLocation = photoLocation;
	}
	public float getIncome() {
		return income;
	}
	public void setIncome(float income) {
		this.income = income;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	@Override
	public String toString() {
		return "AadharDetails [uid=" + uid + ", name=" + name + ", dob=" + dob + ", verifiers="
				+ Arrays.toString(verifiers) + ", photoLocation=" + photoLocation + ", income=" + income
				+ ", phoneNuber=" + phoneNumber + "]";
	}
	
	

}
