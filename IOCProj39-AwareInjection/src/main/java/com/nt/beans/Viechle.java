package com.nt.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Viechle implements ApplicationContextAware,BeanFactoryAware,BeanNameAware {
	private String beanId;
	private ApplicationContext ctx=null;
	private BeanFactory factory=null;
	private String beanName;

	
	public void setApplicationContext(ApplicationContext ctx)throws BeansException {
		this.ctx=ctx;
		System.out.println("AwareInjection:setApplicationContext(-)");
	}
	
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
	
		Engine engg = null;
		//get Engine (Dependency lookup)
		engg = ctx.getBean(beanId, Engine.class);

		 //use engine
		engg.start();
		System.out.println("Viechle moved");
		System.out.println("Injection bean id"+beanName);
		System.out.println("is CurrentBean is singlegon?"+factory.isSingleton(beanName));
		System.out.println("is CurrentBean is prototype?"+factory.isPrototype(beanName));		
	} // method

	public void setBeanName(String beanName) {
		System.out.println("AwareInjection:setBeanName(-)");
		this.beanName=beanName;
		
	}

	public void setBeanFactory(BeanFactory factory) throws BeansException {
		System.out.println("AwareInjection:setBeanFactory(-)");
		this.factory=factory;
	}

}//class
