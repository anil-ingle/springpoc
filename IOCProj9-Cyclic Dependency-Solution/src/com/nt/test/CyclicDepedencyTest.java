package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.A;

public class CyclicDepedencyTest {

	public static void main(String[] args) {
		BeanFactory factory=null;
		 A a=null;
		//create IOC container
		factory=new XmlBeanFactory(new FileSystemResource("src/com/nt/cfgs/applicationContext.xml"));
		//get Bean
		a=factory.getBean("a1",A.class);
		System.out.println(a);
	}//main
}//class
