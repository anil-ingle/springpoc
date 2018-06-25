package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.FileSystemResource;

import com.nt.controller.StudentController;

public class ClientApp {

	public static void main(String[] args) {
		//BeanFactory pFactory=null,cFactory=null;
		DefaultListableBeanFactory pFactory=null,cFactory=null;
		XmlBeanDefinitionReader pReader=null,cReader=null;
		String result=null;
		StudentController controller=null;

		/*//create parentIOC Container
		pFactory=new XmlBeanFactory(new FileSystemResource("src/main/java/com/nt/cfgs/business-beans.xml"));
		//create child IOC container
		cFactory=new XmlBeanFactory(new FileSystemResource("src/main/java/com/nt/cfgs/presentation-beans.xml"),pFactory);
*/
		//create parentIOC Container
		pFactory=new DefaultListableBeanFactory();
		pReader=new XmlBeanDefinitionReader(pFactory);
		pReader.loadBeanDefinitions(new FileSystemResource("src/main/java/com/nt/cfgs/business-beans.xml"));
		
		//create parentIOC Container
		cFactory=new DefaultListableBeanFactory(pFactory);
		cReader=new XmlBeanDefinitionReader(cFactory);
		cReader.loadBeanDefinitions(new FileSystemResource("src/main/java/com/nt/cfgs/presentation-beans.xml"));
				
		
		//get Bean
		controller=cFactory.getBean("stController",StudentController.class);
		try{
		 result=controller.processStudentInfo("1235","bahubali1","45.23" ,"45.44","36.66");
		 System.out.println(result);
		}
		catch(Exception e){
			System.out.println("Internal Problem:::"+e.getMessage());
		}

	}//main
}//class
