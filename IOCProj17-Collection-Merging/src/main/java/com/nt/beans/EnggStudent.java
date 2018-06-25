package com.nt.beans;

import java.util.List;

public class EnggStudent {
	private List<String> subjects;

	//setter methods
	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}

	@Override
	public String toString() {
		return "EnggStudent [subjects=" + subjects + "]";
	}
	

}
