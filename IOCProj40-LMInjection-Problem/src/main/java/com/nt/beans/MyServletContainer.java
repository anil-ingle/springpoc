package com.nt.beans;

public class MyServletContainer {
	private RequestHandler handler;
	
	public MyServletContainer() {
		System.out.println("MyServletContainer:0-param constructor");
	}

	public void setHandler(RequestHandler handler){
	   this.handler=handler;
	  }
	 public void  processRequest(String data){
	  System.out.println("Request came to Container for processing....");
	    handler.handle(data);
	  }

}//class
