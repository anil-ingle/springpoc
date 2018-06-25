package com.nt.beans;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MyServletContainer implements ApplicationContextAware{
	private String beanId;
	private ApplicationContext ctx;
	
	

	public void setBeanId(String beanId) {
		this.beanId = beanId;
	}
	
	@Override
	public void setApplicationContext(ApplicationContext ctx) throws BeansException {
		this.ctx=ctx;
	}


	public MyServletContainer() {
		System.out.println("MyServletContainer:0-param constructor");
	}

	 public void  processRequest(String data){
	  RequestHandler handler=null;
		 System.out.println("Request came to Container for processing....");
	   //get Depedent Bean
       handler=ctx.getBean(beanId,RequestHandler.class);
	    handler.handle(data);
	  }


}//class
