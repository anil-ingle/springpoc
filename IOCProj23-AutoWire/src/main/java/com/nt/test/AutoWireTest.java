package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.nt.service.TravelAgent;

public class AutoWireTest {

	public static void main(String[] args) {
		Resource res=null;
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		TravelAgent agent=null;
		//Locate spring Bean cfg file
		res=new FileSystemResource("src/main/java/com/nt/cfgs/applicationContext.xml");
		
		//create IOC container
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions(res);
		
		//get Bean
		agent=factory.getBean("agent",TravelAgent.class);
		System.out.println(agent);
	}//main
}//class
