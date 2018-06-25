package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nt.controller.StudentController;

public class ClientApp {

	public static void main(String[] args) {
		BeanFactory factory=null;
		String result=null;
		StudentController controller=null;
		//create IOC Container
		factory=new XmlBeanFactory(new ClassPathResource("com/nt/cfgs/applicationContext.xml"));
		//get Bean
		controller=factory.getBean("stController",StudentController.class);
		try{
		 result=controller.processStudentInfo("5645","bahubali","45.23" ,"45.44","36.66");
		 System.out.println(result);
		}
		catch(Exception e){
			System.out.println("Internal Problem:::"+e.getMessage());
		}

	}//main
}//class
