package com.nt.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository("withdrawDAO")
public class WithdrawDAOImpl implements WithdrawDAO {
	int count=0;
	private static final String WITHDRAW_QUERY="UPDATE DTX_ACCOUNT SET BALANCE=BALANCE-? WHERE ACCNO=?";

	@Autowired
	@Qualifier("oraJt")
	private JdbcTemplate jt;

	@Override
	public int withdraw(int accNo, int amt) {
		count=jt.update(WITHDRAW_QUERY,amt,accNo);
		return count;
	}

}
