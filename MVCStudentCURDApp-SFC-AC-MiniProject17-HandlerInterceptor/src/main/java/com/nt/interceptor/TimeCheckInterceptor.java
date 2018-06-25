package com.nt.interceptor;

import java.util.Calendar;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class TimeCheckInterceptor extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		Calendar calendar=null;
		RequestDispatcher rd=null;
		int hour=0;
		//get System Date
		calendar=Calendar.getInstance();
		//get current hour of the day
		hour=calendar.get(Calendar.HOUR_OF_DAY);
		if(hour>=9 && hour<=17)
			return true;
		else{
		  //forward request error page
		   rd=request.getRequestDispatcher("/timeout.jsp"); //place timeout.jsp outside WEB-INF folder
		   rd.forward(request,response);
		   return false;
		}//else
	}//preHandler(-,-,-)
}//class
