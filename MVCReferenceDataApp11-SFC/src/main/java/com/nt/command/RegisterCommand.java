package com.nt.command;

import java.util.Arrays;

public class RegisterCommand {
	private String name;
	private String addrs;
	private String country;
	private String[] courses,hobies;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddrs() {
		return addrs;
	}
	public void setAddrs(String addrs) {
		this.addrs = addrs;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String[] getCourses() {
		return courses;
	}
	public void setCourses(String[] courses) {
		this.courses = courses;
	}
	public String[] getHobies() {
		return hobies;
	}
	public void setHobies(String[] hobies) {
		this.hobies = hobies;
	}
	@Override
	public String toString() {
		return "RegisterCommand [name=" + name + ", addrs=" + addrs + ", country=" + country + ", courses="
				+ Arrays.toString(courses) + ", hobies=" + Arrays.toString(hobies) + "]";
	}
   
}
