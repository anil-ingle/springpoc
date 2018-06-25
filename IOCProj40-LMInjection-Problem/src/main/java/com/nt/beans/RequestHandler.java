package com.nt.beans;

public class RequestHandler {
	private static int count=0;
	public RequestHandler() {
	 System.out.println("RequestHandler:0-param consturctor");
	 count++;
	}

	public void handle(String data) {
		System.out.println("Object count::"+count);
		System.out.println("Handling request with Data::" + data);
	}

}
