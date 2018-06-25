package com.nt.bo;

public class PassengerBO {
	private int pid;
	private String name;
	private int age;
	private String boardingForm;
	private String destination;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getBoardingForm() {
		return boardingForm;
	}
	public void setBoardingForm(String boardingForm) {
		this.boardingForm = boardingForm;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}

}
