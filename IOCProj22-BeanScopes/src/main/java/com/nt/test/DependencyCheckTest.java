package com.nt.test;

import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.nt.beans.Student;

public class DependencyCheckTest {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		Resource res=null;
		BeanDefinitionReader reader=null;
		Student st=null;
		//create IOC container
		 res = new FileSystemResource("src/main/java/com/nt/cfgs/applicationContext.xml");
	     factory = new DefaultListableBeanFactory();
	     reader= new XmlBeanDefinitionReader(factory);
	     reader.loadBeanDefinitions(res);
	     
	     //get Bean
	     st=factory.getBean("st",Student.class);
	     System.out.println(st);
	}//main
}//class
