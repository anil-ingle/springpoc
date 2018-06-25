package com.nt.beans;

import java.util.Arrays;
import java.util.Date;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("flipkart")
@Scope("singleton")
@Lazy
public class Flipkart {
	@Autowired
	@Qualifier("blueDart")
	private Courier courier;
	@Autowired
	private Date dop;

	public Flipkart() {
		System.out.println("Flipkart:0-param constructor");
	}
	
	public String shopping(String items[] ){
		float billAmt=0.0f;
		Random  rad=null;
		int orderId;
		//shooping logic
		billAmt=items.length * 600;
		//generate OrderId
		rad=new Random();
		orderId=rad.nextInt(1000);
		return Arrays.toString(items)+" are shopped on"+dop+" with billAmt"+billAmt+"    "+courier.deliver(orderId);
	}//method
}//class
