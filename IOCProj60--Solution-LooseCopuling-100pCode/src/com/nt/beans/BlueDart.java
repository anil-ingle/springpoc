package com.nt.beans;

import javax.inject.Named;

@Named("blueDart")
public class BlueDart implements Courier {
	
	public String deliver(int orderId){
		
		return orderId+" order is delivered::BlueDart";
	}

}
