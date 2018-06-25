package com.nt.beans;

import java.util.Date;
import java.util.Map;

public class University {
	private Map<String,String> faculties;
    private Map<?,?> data;
    
	public void setData(Map<?, ?> data) {
		this.data = data;
	}

	public void setFaculties(Map<String, String> faculties) {
		this.faculties = faculties;
	}

	@Override
	public String toString() {
		return "University [faculties=" + faculties + ", data=" + data + "]";
	}

	
	

}
