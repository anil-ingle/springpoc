package com.nt.beans;

public  class IntrAmtCalculatorService {
	
	public  float calcIntrAmt(float pAmt,float time){
		System.out.println("orginal logic.....(2 params)");
		return (pAmt*time*2)/100;
	}
	
	public float calcIntrAmt(float pAmt,float time,float rate){
		System.out.println("orginal logic.....(3 params)");
		return (pAmt*time*rate)/100;
	}
	
	
	

}
