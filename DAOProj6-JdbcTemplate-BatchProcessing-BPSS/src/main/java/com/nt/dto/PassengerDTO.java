package com.nt.dto;

import java.io.Serializable;

public class PassengerDTO implements Serializable {
	private String name;
	private int age;
	private String boardingForm;
	private String destination;
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
