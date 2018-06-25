package com.nt.service;

import java.io.IOException;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.nt.dao.BankDAO;

@Service("bankService")
public class BankServiceImpl implements BankService {

	@Autowired
	private  BankDAO dao;


	@Transactional(propagation=Propagation.REQUIRED,
			      readOnly=false,
			      transactionManager="dsTxMgmr",timeout=30)
	@Override
	public boolean transferMoney(int srcNo, int destNo, float amount){
		int result1=0,result2=0;
		boolean flag=false;
      //use DAO
		result1=dao.withdraw(srcNo,amount);
		result2=dao.deposite(destNo,amount);
		if(result1==0 || result2==0){
			flag=false;
			throw new IllegalArgumentException();
		}
		else{
			flag=true;
		}
		return flag;
	}//transferMoney(-,-,-)
}//class
