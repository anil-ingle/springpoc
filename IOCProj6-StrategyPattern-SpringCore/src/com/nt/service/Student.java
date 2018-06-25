package com.nt.service;

public class Student {
	private Course course;

	public void setCourse(Course course) {
		this.course = course;
	}
	
	//b.method
	public String applyForJobs(){
		return course.studyCourse()+" applied for IT Jobs";
	}
	

}
