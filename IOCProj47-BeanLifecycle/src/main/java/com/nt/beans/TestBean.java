package com.nt.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class TestBean implements ApplicationContextAware,BeanFactoryAware, BeanNameAware, InitializingBean, DisposableBean {
  private String name;
	
  public TestBean() {
	System.out.println("TestBean:0-param constructor");
}
  
	public void setName(String name) {
		System.out.println("TestBean:setName(-)");
	this.name = name;
}

	@Override
	public void destroy() throws Exception {
		System.out.println("TestBean:destroy()");
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("TestBean:afterPropertiesSet()");
		
	}

	@Override
	public void setBeanName(String arg0) {
		System.out.println("TestBean:setBeaName()");
		
	}

	@Override
	public void setApplicationContext(ApplicationContext arg0) throws BeansException {
		System.out.println("TestBean:setApplicationContext()");
		
	}

	public void myInit(){
		System.out.println("TestBean:myInit()");
	}
	
	public void myDestroy(){
		System.out.println("TestBean:myDestroy()");
	}

	@Override
	public void setBeanFactory(BeanFactory arg0) throws BeansException {
		System.out.println("TestBean:setBeanFactory(-)");
		
	}
	
}
