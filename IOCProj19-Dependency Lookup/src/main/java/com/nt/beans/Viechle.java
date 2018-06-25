package com.nt.beans;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class Viechle {
	private String beanId;

	public void setBeanId(String beanId) {
		this.beanId = beanId;
	}

	public void soundHorn() {
		System.out.println("Horn:Skoda Horn");
	}

	public void entertainment() {
		System.out.println("Entertainment: DVD Player with LED screens");
	}

	public void move() {
		System.out.println("move() method");
		BeanFactory factory = null;
		Engine engg = null;
		// create IOC container
		factory = new XmlBeanFactory(new FileSystemResource("src/main/java/com/nt/cfgs/applicationContext.xml"));
		//get Engine (Dependency lookup)
		engg = factory.getBean(beanId, Engine.class);

		 //use engine
		engg.start();
		System.out.println("Viechle moved");
	} // method

}//class
