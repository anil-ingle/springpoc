package com.nt.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MyServletContainer {
	private String beanId;
	
	public void setBeanId(String beanId) {
		this.beanId = beanId;
	}

	public MyServletContainer() {
		System.out.println("MyServletContainer:0-param constructor");
	}

	 public void  processRequest(String data){
	  ApplicationContext ctx=null;
	  RequestHandler handler=null;
		 System.out.println("Request came to Container for processing....");
	   ctx=new FileSystemXmlApplicationContext("src/main/java/com/nt/cfgs/applicationContext.xml");
	   //get Depedent Bean
       handler=ctx.getBean(beanId,RequestHandler.class);
	    handler.handle(data);
	  }

}//class
