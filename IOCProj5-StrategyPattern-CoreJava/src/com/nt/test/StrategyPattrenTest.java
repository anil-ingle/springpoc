package com.nt.test;

import com.nt.factory.StudentFactory;
import com.nt.service.Student;

public class StrategyPattrenTest {

	public static void main(String[] args) {
		Student stud=null;
		//get Java Student Object
		stud=StudentFactory.createStudentWithCourse("java");
		System.out.println(stud.applyForJobs());
		System.out.println("-----------------------------");
		stud=StudentFactory.createStudentWithCourse(".net");
		System.out.println(stud.applyForJobs());
		System.out.println("-----------------------------");
	}//main
}//class

