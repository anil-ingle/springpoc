package com.nt.service;

import java.sql.SQLException;

public interface BankService {
	public boolean transferMoney(int srcNo,int destNo,float amount)throws SQLException;

}
