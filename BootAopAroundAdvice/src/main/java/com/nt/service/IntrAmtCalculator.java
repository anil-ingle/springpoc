package com.nt.service;

import org.springframework.stereotype.Service;

@Service("iac")
public  class IntrAmtCalculator {
	public  float calcIntrAmount(float pAmt,float time,float rate){
		System.out.println("IntrAmtCalculator:calcIntrAmount(-,-,-)");
		return (pAmt*time*rate)/100.0f;
	}
}
