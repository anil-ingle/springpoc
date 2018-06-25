package com.nt.controller;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class WishController extends AbstractController {

	@Override
	public ModelAndView handleRequestInternal(HttpServletRequest req, HttpServletResponse res) throws Exception {
		Calendar cal=null;
		int hour=0;
		String wMsg=null;
		//get System Date
		cal=Calendar.getInstance();
		//get Current hour of the day
		hour=cal.get(Calendar.HOUR_OF_DAY);
		//generate Wish Message...
		if(hour<=12)
			wMsg="Good Morning";
		else if(hour<=16)
			wMsg="Good AfterNoon";
		else if(hour<=20)
			wMsg="Good Evening";
		else
			wMsg="Good Night";
		//create and return MAV
		return new ModelAndView("result","msg",wMsg);
	}//hanldeRequestInternal(-,-,-)
}//class
