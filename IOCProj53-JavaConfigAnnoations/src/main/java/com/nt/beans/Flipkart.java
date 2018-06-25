package com.nt.beans;

import java.util.Arrays;
import java.util.Date;
import java.util.Random;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Qualifier;



@Named("flipkart")
public class Flipkart {
	/*@Inject
	@Named("blueDart")*/
	private Courier courier;
	/*@Inject*/
	private Date dop;
	
	/*@Inject
	public Flipkart(@Named("blueDart")Courier courier, Date dop) {
		System.out.println("Flipkart:2-param constructor");
		this.courier = courier;
		this.dop = dop;
	}
	*/
	
	
	/*@Inject
	@Named("blueDart")
	public void setCourier(Courier courier) {
		this.courier = courier;
	}

	@Inject
	public void setDop(Date dop) {
		this.dop = dop;
	}*/
	
/*	@Inject
	public void assign(@Named("dtdc")Courier courier,Date dop){
		this.courier=courier;
		this.dop=dop;
	}*/
	
	

	
	
	
	

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
