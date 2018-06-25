package com.nt.service;

import java.sql.SQLException;

public class Shopping {
	
	public float shopping(float qty,float rate)throws SQLException{
		if(qty==0 || rate==0)
			throw new SQLException("Invalid inputs");
		else
			return rate*qty;
	}

}
