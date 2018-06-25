package com.nt.beans;

public class FirstFlight implements Courier {

	public FirstFlight() {
		System.out.println("FirstFlight:0-param constructor");
	}
	
	@Override
	public String deliver(int orderId) {
		
		return orderId+"  order is delived::: Firstflight";
	}

}
