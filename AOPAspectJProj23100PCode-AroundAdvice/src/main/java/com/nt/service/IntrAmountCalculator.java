package com.nt.service;

import org.springframework.stereotype.Service;

@Service("iac")
public class IntrAmountCalculator {
	
	public float calcSimpleIntrAmount(float pAmt,float rate,float time){
		System.out.println("IAC:calcSimpleIntrAmount(-,-,-)::"+rate);
		return  (pAmt*rate*time)/100.0f;
	}
	
	public float calcCompoundIntrAmount(float pAmt,float rate,float time){
		System.out.println("AC:calcCompoundIntrAmount(-,-,-)::"+rate);
		return (float) (pAmt*Math.pow((1+rate/100),time)-pAmt);
		
	}

}
