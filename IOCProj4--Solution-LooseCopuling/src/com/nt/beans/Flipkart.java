package com.nt.beans;

import java.util.Arrays;
import java.util.Random;

public class Flipkart {
	private Courier courier;

	public void setCourier(Courier courier) {
		this.courier=courier;
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
		return Arrays.toString(items)+" are shopped with billAmt"+billAmt+"    "+courier.deliver(orderId);
	}//method
}//class
