package com.nt.beans;

import javax.inject.Named;

@Named("firstFlight")
public class FirstFlight implements Courier {

	@Override
	public String deliver(int orderId) {
		
		return orderId+"  order is delived::: Firstflight";
	}

}
