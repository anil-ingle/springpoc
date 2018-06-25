package com.nt.controller;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.EmployeeSearchService;

public class EmployeeSearchControllerServlet extends HttpServlet {
	 ApplicationContext ctx;	
	@Override
	public void init() throws ServletException {
	 
	  ctx=new ClassPathXmlApplicationContext("/com/nt/cfgs/applicationContext.xml");
	}
	
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String job[]=null;
		EmployeeSearchService service=null;
		List<Map<String,Object>> list=null;
		RequestDispatcher rd=null;
		//read form data
		job=req.getParameterValues("desgs");
		//get Service class obj
		service=ctx.getBean("empService",EmployeeSearchService.class);
		//use Service
		list=service.findEmpsByDesg(job);
		//keep results in request Scope
		req.setAttribute("searchResults",list);
		//forward controller to report.jsp
		rd=req.getRequestDispatcher("/report.jsp");
		rd.forward(req,resp);
	}//doGet(-,-)
	
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	  doGet(req,resp);
	}//doPost(-,-)
}//class
