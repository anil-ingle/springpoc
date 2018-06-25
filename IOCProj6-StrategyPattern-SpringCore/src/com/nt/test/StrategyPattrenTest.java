package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nt.service.Student;

public class StrategyPattrenTest {

	public static void main(String[] args) {
		Student stud=null;
		BeanFactory factory=null;
          		
		//create IOC Container
		factory=new XmlBeanFactory(new ClassPathResource("com/nt/cfgs/applicationContext.xml"));
		//get Bean
		stud=factory.getBean("st",Student.class);
		System.out.println(stud.applyForJobs());
		
	}//main
}//class

