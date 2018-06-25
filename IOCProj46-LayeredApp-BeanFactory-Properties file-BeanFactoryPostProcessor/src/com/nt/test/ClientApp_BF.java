package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.controller.StudentController;

public class ClientApp_BF {

	public static void main(String[] args) {
		BeanFactory factory=null;
		String result=null;
		StudentController controller=null;
		PropertyPlaceholderConfigurer configurer;
		
		//create IOC Container
		factory=new XmlBeanFactory(new FileSystemResource("src/com/nt/cfgs/applicationContext.xml"));
		
        //register BeanFactoryPostProcess(PropertyPlaceholderConfigurer) 
		configurer=factory.getBean("pphc",PropertyPlaceholderConfigurer.class);
		configurer.postProcessBeanFactory((ConfigurableListableBeanFactory) factory);
		
		//get Bean
		controller=factory.getBean("stController",StudentController.class);
		try{
		 result=controller.processStudentInfo("9647","bahubali2","45.23" ,"45.44","36.66");
		 System.out.println(result);
		}
		catch(Exception e){
			System.out.println("Internal Problem:::"+e.getMessage());
		}

	}//main
}//class
