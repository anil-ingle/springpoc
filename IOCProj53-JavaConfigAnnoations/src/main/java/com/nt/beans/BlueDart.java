package com.nt.beans;

import javax.inject.Named;

@Named("blueDart")
public class BlueDart implements Courier {
	
	public BlueDart() {
		System.out.println("BlueDart:0-param cosntructor");
	}
	
	public String deliver(int orderId){
		
		return orderId+" order is delivered::BlueDart";
	}

}
