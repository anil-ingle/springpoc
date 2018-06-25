package com.nt.beans;

import javax.inject.Named;

@Named("dtdc")
public class DTDC implements Courier {
	
	public String deliver(int orderId){
		
		return orderId+" order is delivered::DTDC";
	}

	

}
