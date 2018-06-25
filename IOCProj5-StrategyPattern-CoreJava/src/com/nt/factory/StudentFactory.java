package com.nt.factory;

import com.nt.service.Course;
import com.nt.service.DotNetCourse;
import com.nt.service.JavaCourse;
import com.nt.service.PHPCourse;
import com.nt.service.Student;

public class StudentFactory {
	
	public static Student createStudentWithCourse(String courseType){
		Course course=null;
		Student student=new Student();
		if(courseType.equalsIgnoreCase("java")){
			course=new JavaCourse();
			student.setCourse(course);
		}
		else if(courseType.equalsIgnoreCase(".net")){
		  course=new DotNetCourse();
		  student.setCourse(course);
		}
		else if(courseType.equalsIgnoreCase("php")){
			course=new PHPCourse();
			student.setCourse(course);
		}
		else{
			throw new IllegalArgumentException("Not a Supported Course");
		}
		return student;
	}//method

}//class
