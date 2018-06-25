package com.nt.dao;

public interface BankDAO {
  public int withdraw(int accNo,float amount);
  public int deposite(int accNo,float amount);
	
}
