package com.nt.handler;

import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class DoublePostingHandler extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println("preHandler(-) method...");
		String method=null;
		int sToken=0,cToken=0;
		HttpSession ses=null;
		RequestDispatcher rd=null;
		
		if(request.getMethod().equalsIgnoreCase("GET")){
			if(request.getSession()==null)
				ses=request.getSession(true);
			else
				ses=request.getSession(false);
			//create ServerSide Toke
			ses.setAttribute("sToken",new Random().nextInt(10000));
			return true;
		}
		else{ //when form is submitted or when refresh button is clicked
			//read both Client And ServerTokens
			ses=request.getSession(false);
			sToken=(Integer)ses.getAttribute("sToken");
			cToken=Integer.parseInt(request.getParameter("cToken"));
			if(sToken==cToken){
				ses.setAttribute("sToken",new Random().nextInt(10000));
				return true;
			}
			else{
			  rd=request.getRequestDispatcher("dbl_post.jsp");
			  rd.forward(request, response);
			  return false;
			}//else
			
		}//eelse
	}//method
}//class
