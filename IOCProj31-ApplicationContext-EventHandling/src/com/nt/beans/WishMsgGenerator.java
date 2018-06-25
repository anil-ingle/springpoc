package com.nt.beans;

import java.util.Date;

public class WishMsgGenerator {
	static{
	 System.out.println("WishMsgGenerator::static block");
	}
	private Date date;
	
    public WishMsgGenerator() {
		System.out.println("WishMsgGenerator:0-param constructor");
	}
	
	 //setter method
	public void setDates(Date date) {
		System.out.println("WishMsgGenerator:setDate(-)");
		this.date = date;
	}
	
	//B.method
	public String generateWishMsg(String uname){
		System.out.println("WishMsgGenerator::generateWishMsg(-)");
		int hour=0;
		//get current hour of the day
		System.out.println("date=="+date);
		hour=date.getHours();
		//write b.logic
		if(hour<=12)
			return "Good morning"+uname;
		else if(hour<=16)
			return "Good Afternoon"+uname;
		else if(hour<=20)
			return "Good Evening"+uname;
		else
			return "Good Night"+uname;
	}//method
}//class
