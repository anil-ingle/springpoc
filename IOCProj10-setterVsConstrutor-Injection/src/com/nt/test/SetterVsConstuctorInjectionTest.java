package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.StudentDetails;

public class SetterVsConstuctorInjectionTest {

	public static void main(String[] args) {
		BeanFactory factory=null;
		StudentDetails details=null;
		//create IOC container
		factory=new XmlBeanFactory(new FileSystemResource("src/com/nt/cfgs/applicationContext.xml"));
		//get Bean
		details=factory.getBean("stDetails",StudentDetails.class);
		System.out.println(details);
	}//main
}//class
