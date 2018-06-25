package com.nt.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class GenerateStudentReportController extends AbstractController {

	@Override
	public ModelAndView handleRequestInternal(HttpServletRequest req, HttpServletResponse res) throws Exception {
	   List<String> stList=null;
	   String param=null;
	   stList=new ArrayList();
	   stList.add("raja");stList.add("rani");stList.add("ramesh");
	   //read "type" req param value
	   param=req.getParameter("type");
	   if(param.equalsIgnoreCase("pdf")){
		   return new ModelAndView("srpv","stList",stList);
	   }
	   else{
		   return new ModelAndView("srev","stList",stList);
	   }
	}
}
