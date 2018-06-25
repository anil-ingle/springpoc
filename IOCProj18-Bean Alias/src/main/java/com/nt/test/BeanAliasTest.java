package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.Computer;


public class BeanAliasTest {

	public static void main(String[] args) {
		BeanFactory factory=null;
		Computer comp1=null,comp2=null,comp3=null,comp4=null,comp5=null;
		
		//create IOC container
		factory=new XmlBeanFactory(new FileSystemResource("src/main/java/com/nt/cfgs/applicationContext.xml"));
		//get Bean
		comp1=factory.getBean("pc",Computer.class);
		System.out.println(comp1);
		System.out.println("------------------------");
		//get Bean
		comp2=factory.getBean("sys",Computer.class);
		System.out.println(comp2);
		System.out.println("------------------------");
		//get Bean
		comp3=factory.getBean("desktop",Computer.class);
		System.out.println(comp3);
		System.out.println("------------------------");
		//get Bean
		comp4=factory.getBean("machine",Computer.class);
		System.out.println(comp4);
		System.out.println("------------------------");
		//get Bean
		comp5=factory.getBean("yantra",Computer.class);
		System.out.println(comp5);
		System.out.println("------------------------");
		System.out.println(comp1.hashCode()+"  "+comp2.hashCode()+"  "+comp3.hashCode()+" "+comp4.hashCode()+" "+comp5.hashCode());
	}//main
}//class
