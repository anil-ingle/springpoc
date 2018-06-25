package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nt.beans.Student;

public class InnerBeanTest {

	public static void main(String[] args) {
		BeanFactory factory=null;
		Student stud=null,stud1=null,stud2=null;
		//create IOC container
		factory=new XmlBeanFactory(new ClassPathResource("com/nt/cfgs/applicationContext.xml"));
		//get Bean
	    stud=factory.getBean("com.nt.beans.Student#0",Student.class);
	    System.out.println(stud.writeExam());
	    
	    stud1=factory.getBean("com.nt.beans.Student#1",Student.class);
	    System.out.println(stud1.writeExam());
	    
	    stud2=factory.getBean("com.nt.beans.Student#2",Student.class);
	    System.out.println(stud2.writeExam());
	    
	    
	}//main
}//class
