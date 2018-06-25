package com.nt.beans;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public abstract class MyServletContainer{
	
	public MyServletContainer() {
		System.out.println("MyServletContainer:0-param constructor");
	}
	
	
	public abstract RequestHandler getRequestHandler();

	 public void  processRequest(String data){
	  RequestHandler handler=null;
	  //get Depedent class object
	  handler=getRequestHandler();
	  System.out.println("Request came to Container for processing....");
	   handler.handle(data);
	 }//method
}//class
