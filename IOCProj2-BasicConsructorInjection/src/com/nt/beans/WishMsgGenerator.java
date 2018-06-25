package com.nt.beans;

import java.util.Date;

public class WishMsgGenerator {
	//bean property
	private Date date;
	
    public void setDate(Date date) {
    	System.out.println("WishMsgGenerator::setDate(-)");
		this.date = date;
	}

	//constructor for constructor injection
	public WishMsgGenerator(Date date) {
		System.out.println("WishMsgGenerator:1-param constructor");
		this.date = date;
	}
	
	//b.method
	public String generateWishMsg(String name){
		System.out.println("Date::"+date);
		int hour=0;
		//get current hour of the day
		hour=date.getHours();
		//generate wish msg
		if(hour<=12)
			return "GM::"+name;
		else if(hour<=16)
			return "GA::"+name;
		else if(hour<=20)
			return "GE::"+name;
		else
			return "GN::"+name;
	}//method
}//class

