package com.nt.beans;

public class LibraryMembership {
	private int lid;
	private String type;
	
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "LibraryMembership [lid=" + lid + ", type=" + type + "]";
	}
	

}
