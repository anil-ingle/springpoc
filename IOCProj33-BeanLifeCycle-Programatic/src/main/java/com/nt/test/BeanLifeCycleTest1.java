package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.CheckingVotingElgibility;


public class BeanLifeCycleTest1 {

	public static void main(String[] args) {
		 BeanFactory factory=null;
		CheckingVotingElgibility voter=null;
		
		//create IOC container
		factory=new XmlBeanFactory(new FileSystemResource("src/main/java/com/nt/cfgs/applicationContext.xml"));
        //get Bean 
		voter=factory.getBean("voter",CheckingVotingElgibility.class);

		System.out.println(voter.checkElgibility());
		
		((DefaultListableBeanFactory) factory).destroySingletons();
		
		
	}//main
}//class
