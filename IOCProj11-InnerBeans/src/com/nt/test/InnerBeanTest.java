package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nt.beans.Student;

public class InnerBeanTest {

	public static void main(String[] args) {
		BeanFactory factory=null;
		Student stud=null;
		//create IOC container
		factory=new XmlBeanFactory(new ClassPathResource("com/nt/cfgs/applicationContext.xml"));
		//get Bean
	    stud=factory.getBean("st",Student.class);
	    System.out.println(stud.writeExam());
	    
	    
	    
	}//main
}//class
