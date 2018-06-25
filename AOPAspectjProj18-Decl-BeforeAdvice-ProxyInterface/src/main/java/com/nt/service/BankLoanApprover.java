package com.nt.service;

import java.util.Calendar;

public class BankLoanApprover implements BankLoanApproverInterface{
	
	public String approveLoan(int loanId,String type){
		System.out.println("Loan Id"+loanId);
		Calendar calendar=null;
		int month=0;
		//get System Date
		calendar=Calendar.getInstance();
		//get month
		month=calendar.get(Calendar.MONTH);

		if(type.equals("agriculture")){
		  	if(month>=6 && month<=10){
		  		return loanId+"-->Loan Approved";
		  	}
		  	else {
		  		return  loanId+"-->Loan not Approved";
		  	}
		}
		else{
			return loanId+"-->Loan not Approved";
		}
	}//approveLoan
}//class
