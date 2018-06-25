package com.nt.beans;

public class FirstFlight implements Courier {

	@Override
	public String deliver(int orderId) {
		
		return orderId+"  order is delived::: Firstflight";
	}

}
