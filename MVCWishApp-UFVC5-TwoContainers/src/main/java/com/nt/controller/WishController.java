package com.nt.controller;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.nt.service.WishService;

public class WishController extends AbstractController {
  
	private WishService service;
	
	   public void setService(WishService service) {
			this.service = service;
		}

     
	@Override
	public ModelAndView handleRequestInternal(HttpServletRequest req, HttpServletResponse res) throws Exception {
		String wMsg=null;
		//use service class
		wMsg=service.generateWishService();
		//create and return MAV
		return new ModelAndView("result","msg",wMsg);
	}//hanldeRequestInternal(-,-,-)
}//class
