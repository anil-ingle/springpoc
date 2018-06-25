package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.Employee;

public class PAndCNameSpaceTest {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		Employee emp=null;
	   //create IOC container
	    factory=new DefaultListableBeanFactory();
	    reader=new XmlBeanDefinitionReader(factory);
	    reader.loadBeanDefinitions(new FileSystemResource("src/main/java/com/nt/cfgs/applicationContext.xml"));
	    
	    //get Bean 
	    emp=factory.getBean("emp",Employee.class);
	    System.out.println(emp);
	    
	}//main
}//class
