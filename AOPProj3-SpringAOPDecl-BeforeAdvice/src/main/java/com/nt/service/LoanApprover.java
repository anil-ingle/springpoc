package com.nt.service;

import java.util.Calendar;

public class LoanApprover {
	
	public String approveLoan(int loanId,String approver,String type){
		Calendar calendar=null;
		int month=0;
		//get System date
		calendar=Calendar.getInstance();
		month=calendar.get(Calendar.MONTH);
		
		if(type.equalsIgnoreCase("agriculture")){
		  	if(month>=7 && month<=11){
		  		return loanId+" Loan is approved by-->"+approver;
		  	}
		}
		return loanId+" Loan is rejected by -->"+approver;
	}//method
}//class
