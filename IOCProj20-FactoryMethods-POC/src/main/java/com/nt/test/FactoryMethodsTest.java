package com.nt.test;

import java.util.Calendar;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class FactoryMethodsTest {

	public static void main(String[] args) {
		BeanFactory factory=null;
		Calendar cal=null;
		Class clazz=null;
		String s2=null,s3=null;
		//create IOC container
		factory=new XmlBeanFactory(new FileSystemResource("src/main/java/com/nt/cfgs/applicationContext.xml"));
		//get Bean 
		cal=factory.getBean("cal",Calendar.class);
		System.out.println("object data::"+cal+" class"+cal.getClass());
		System.out.println("----------------------------------------");
		
		clazz=factory.getBean("clazz",Class.class);
		System.out.println("object data::"+clazz+" class"+clazz.getClass());
		System.out.println("----------------------------------------");
		
		 s2=factory.getBean("s2",String.class);
		 System.out.println("object data::"+s2+" class"+s2.getClass());
		System.out.println("----------------------------------------");
		
		 s3=factory.getBean("s3",String.class);
		 System.out.println("object data::"+s3+" class"+s3.getClass());
		System.out.println("----------------------------------------");
	}//main
}//class
