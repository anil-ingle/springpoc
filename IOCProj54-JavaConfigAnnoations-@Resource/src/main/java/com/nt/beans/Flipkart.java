package com.nt.beans;

import java.util.Arrays;
import java.util.Date;
import java.util.Random;

import javax.annotation.Resource;
import javax.inject.Named;



@Named("flipkart")
public class Flipkart {
	
	/*@Resource(name="blueDart")*/
	private Courier courier;
	

	/*@Resource*/
	private Date dop;
	
/*	@Resource(name="blueDart")
	public void setCourier(Courier courier) {
		this.courier = courier;
	}

	@Resource
	public void setDop(Date dop) {
		this.dop = dop;
	}
	*/
	
	@Resource
	public void assign(Date dop){
		this.dop=dop;
	}
	@Resource(name="blueDart")
	public void assign(Courier courier){
		this.courier=courier;
	}

	
	
	

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
