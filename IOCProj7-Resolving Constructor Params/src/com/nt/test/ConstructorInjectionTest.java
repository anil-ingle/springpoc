package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.CollegeDetails;
import com.nt.beans.Marks;
import com.nt.beans.Student;

public class ConstructorInjectionTest {

	public static void main(String[] args) {
		BeanFactory factory=null;
		Student stud=null;
		Marks mk=null;
		CollegeDetails details=null;
		//create IOC container
		factory=new XmlBeanFactory(new FileSystemResource("src/com/nt/cfgs/applicationContext.xml"));
		//get Bean
		stud=factory.getBean("st",Student.class);
		//display object data
		System.out.println(stud);
		System.out.println("----------------------------");
		//get bean
		mk=factory.getBean("mk",Marks.class);
		System.out.println(mk);
		System.out.println("-----------------------------");
		details=factory.getBean("cd",CollegeDetails.class);
		System.out.println(details);
	}//main
}//class
