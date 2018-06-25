package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.EnggStudent;

public class CollectionMergingTest {

	public static void main(String[] args) {
		BeanFactory factory=null;
		EnggStudent eceStudent,eeeStudent;
		
		//create IOC container
		factory=new XmlBeanFactory(new FileSystemResource("src/main/java/com/nt/cfgs/applicationContext.xml"));
		//get Bean
		eceStudent=factory.getBean("ece1stYear", EnggStudent.class);
		System.out.println("ECE subjects"+eceStudent);
		System.out.println("---------------------------------------");
		eeeStudent=factory.getBean("eee1stYear", EnggStudent.class);
		System.out.println("EEE Subjects"+eeeStudent);
		
	}

}
