package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.nt.dao.DepositeDAO;
import com.nt.dao.WithdrawDAO;

@Service("bankService")
public class TransferMoneyServiceImpl implements TransferMoneyService {
	@Autowired
	private WithdrawDAO wDAO;
	@Autowired
	private DepositeDAO dDAO;

	
	@Override
	@Transactional(propagation=Propagation.REQUIRED,readOnly=false,
	               timeout=30,transactionManager="dTxMgmr")
	public boolean transferMoney(int srcAcNo, int destAcNo, int amt) {
		int result1=0,result2=0;
		boolean flag=true;
		//use DAOs
		result1=wDAO.withdraw(srcAcNo,amt);
		result2=dDAO.deposite(destAcNo, amt);
		if(result1==0 || result2==0){
			flag=false;
			throw new IllegalArgumentException("invalid inputs");
		}
		return flag;
	}

}
