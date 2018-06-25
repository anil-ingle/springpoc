package com.nt.service;

public class Shopping {
	
	public float calcBillAmt(float price,float qty){
		if(price==0 || qty==0)
			throw new IllegalArgumentException("Invalid inputs");
		else
			return price*qty;
	}//method
}//class
