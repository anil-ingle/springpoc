package com.nt.beans;

import org.springframework.stereotype.Component;

@Component("dtdc")
public class DTDC implements Courier {
	
	public DTDC() {
		System.out.println("DTDC:0-param constructor");
	}
	
	public String deliver(int orderId){
		
		return orderId+" order is delivered::DTDC";
	}

	

}
