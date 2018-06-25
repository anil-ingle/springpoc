package com.nt.service;

public  class IntrAmtCalculator {
	public  float calcIntrAmount(float pAmt,float time,float rate){
		System.out.println("IntrAmtCalculator:calcIntrAmount(-,-,-)");
		return (pAmt*time*rate)/100.0f;
	}
}
