package com.nt.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class HomeViewController implements Controller {
 
	public HomeViewController() {
		System.out.println("HomeViewController:0-param constructor");
	}
	@Override
	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse res) throws Exception {
		System.out.println("HomeViewController:handleRequest(-,-,-)");
		return new ModelAndView("welcome","sysDate",new Date(110,10,10));
	}

}
