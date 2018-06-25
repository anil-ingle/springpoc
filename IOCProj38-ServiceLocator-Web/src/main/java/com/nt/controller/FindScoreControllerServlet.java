package com.nt.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.FindScoreService;

public class FindScoreControllerServlet extends HttpServlet {
	ApplicationContext ctx=null;
	public void init(){
		ctx=new ClassPathXmlApplicationContext("/com/nt/cfgs/applicationContext.xml");
	}
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		int mid=0;
		FindScoreService service=null;
		String scoreCard=null;
		RequestDispatcher rd=null;
		//read matchid
		mid=Integer.parseInt(req.getParameter("matchId"));
		//get LocalService object
		service=ctx.getBean("cbService",FindScoreService.class);
		//use service
		scoreCard=service.findScore(mid);
		//keep ScoreCard in request scope
		req.setAttribute("scoreInfo",scoreCard);
		//forward request to view_score.jsp
		rd=req.getRequestDispatcher("/view_score.jsp");
		rd.forward(req,res);
	}//doGet(-,-)
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		 doGet(req,res);
	}
	
	@Override
	public void destroy() {
		ctx=null;
	}
}//class
