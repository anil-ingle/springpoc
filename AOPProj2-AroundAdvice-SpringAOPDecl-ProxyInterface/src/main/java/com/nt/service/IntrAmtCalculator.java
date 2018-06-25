package com.nt.service;

public final class IntrAmtCalculator implements IntrAmtCalculatorInterface  {


	public  final float calcIntrAmt(float pAmt,float time,float rate){
		System.out.println("IntrAmtCalculator:calcIntrAmount(-,-,-)");
		return (pAmt*time*rate)/100.0f;
	}

	
}
