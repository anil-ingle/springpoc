package com.nt.beans;

public class BlueDart implements Courier {
	
	public String deliver(int orderId){
		
		return orderId+" order is delivered::BlueDart";
	}

}
