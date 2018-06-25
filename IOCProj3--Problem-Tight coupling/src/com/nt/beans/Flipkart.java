package com.nt.beans;

import java.util.Arrays;
import java.util.Random;

public class Flipkart {
	private DTDC dtdc;

	public void setDtdc(DTDC dtdc) {
		this.dtdc = dtdc;
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
		return Arrays.toString(items)+" are shopped with billAmt"+billAmt+"    "+dtdc.deliver(orderId);
	}//method
}//class
