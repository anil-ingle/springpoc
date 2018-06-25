package com.nt.beans;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class WishMsgGenerator {
	//@Autowired
	private Date date;
	
	
	
/*	@Autowired
	public WishMsgGenerator(Date date){
		this.date=date;
	}
	*/
	
	@Autowired(required=true)
	@Qualifier("dt1")
	public void setDate(Date date){
		this.date=date;
	}
	
	//@Autowired
	public void assignDate(Date date){
		this.date=date;
	}
	
	
	
	public String sayHello(String uname){
		return "Good Morning:::"+uname+" date=="+date;
	}
}
