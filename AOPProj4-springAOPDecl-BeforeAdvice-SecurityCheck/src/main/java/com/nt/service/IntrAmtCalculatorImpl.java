package com.nt.service;

public class IntrAmtCalculatorImpl implements IntrAmtCalculator {

	@Override
	public float calcIntrAmount(float pAmt, float time, float rate) {
		System.out.println("Target method....");
		return (pAmt*time*rate)/100.0f;
	}

}
