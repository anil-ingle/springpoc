package com.nt.beans;

import java.util.Arrays;
import java.util.Random;

import javax.annotation.Resource;
import javax.inject.Named;

@Named("flipkart")
public class Flipkart {
	
	@Resource(name="blueDart")
	private Courier courier;


	
	public String shopping(String items[] ){
		float billAmt=0.0f;
		Random  rad=null;
		int orderId;
		//shooping logic
		billAmt=items.length * 600;
		//generate OrderId
		rad=new Random();
		orderId=rad.nextInt(1000);
		return Arrays.toString(items)+" are shopped with billAmt"+billAmt+"    "+courier.deliver(orderId);
	}//method
}//class
