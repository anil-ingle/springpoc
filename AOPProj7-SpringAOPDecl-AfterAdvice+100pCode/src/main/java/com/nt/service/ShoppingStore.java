package com.nt.service;

import org.springframework.stereotype.Component;

@Component("shopping")
public class ShoppingStore {
	
	public float generateBill(String items[],float prices[]){
		float billAmt=0;
		for(float price:prices){
			billAmt=billAmt+price;
		}//for
		return billAmt;
	}//method
}//class
