package com.nt.service;

import java.util.Calendar;

public class WishServiceImpl implements WishService {

	@Override
	public String generateWishService() {
		Calendar calendar=null;
		int hour=0;
		//get System Date
		calendar=Calendar.getInstance();
		//get Current of the day
		hour=calendar.get(Calendar.HOUR_OF_DAY);
		if(hour<=12)
			return "Good morning";
		else if(hour<=16)
			return "Good AfterNoon";
		else if(hour<=20)
			return "Good Evening";
		else
			return "Good Night";
	}//method
}//class
