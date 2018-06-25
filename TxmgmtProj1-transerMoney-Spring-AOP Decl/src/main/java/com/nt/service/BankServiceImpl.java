package com.nt.service;

import com.nt.dao.BankDAO;

public class BankServiceImpl implements BankService {

	private  BankDAO dao;

	public void setDao(BankDAO dao) {
		this.dao = dao;
	}

	@Override
	public boolean transferMoney(int srcNo, int destNo, float amount) {
		int result1=0,result2=0;
		boolean flag=false;
      //use DAO
		result1=dao.withdraw(srcNo,amount);
		result2=dao.deposite(destNo,amount);
		if(result1==0 || result2==0){
			flag=false;
			throw new RuntimeException("transferMoney operation is failed");
		}
		else{
			flag=true;
		}
		return flag;
	}//transferMoney(-,-,-)
}//class
