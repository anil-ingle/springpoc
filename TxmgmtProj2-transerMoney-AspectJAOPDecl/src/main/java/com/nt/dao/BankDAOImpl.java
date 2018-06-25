package com.nt.dao;

import org.springframework.jdbc.core.JdbcTemplate;

public class BankDAOImpl implements BankDAO {
   private static final String WITHDRAW_QUERY="UPDATE ACCOUNT SET BALANCE=BALANCE-? WHERE ACNO=?";
   private static final String DEPOSITE_QUERY="UPDATE ACCOUNT SET BALANCE=BALANCE+? WHERE ACNO=?";
   private  JdbcTemplate jt;
   
	public void setJt(JdbcTemplate jt) {
	this.jt = jt;
    }


	@Override
	public int withdraw(int accNo, float amount) {
	  int count=0;
	  count=jt.update(WITHDRAW_QUERY,amount,accNo);
    return count;
	}//method

	@Override
	public int deposite(int accNo, float amount) {
		int count=0;
		count=jt.update(DEPOSITE_QUERY,amount,accNo);
		return count;
	}//deposite(-)
}//class
