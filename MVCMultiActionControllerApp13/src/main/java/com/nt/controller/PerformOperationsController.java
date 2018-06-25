package com.nt.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import com.nt.command.UserCommand;

public class PerformOperationsController extends MultiActionController {
	
	public ModelAndView add(HttpServletRequest req,HttpServletResponse res,HttpSession ses,UserCommand cmd){
	     ModelAndView mav=null;
	     mav=new ModelAndView();
	     mav.setViewName("result");
	     mav.addObject("cmdData",cmd);
	     mav.addObject("operation","add");
		return mav;
	}
	
	public ModelAndView modify(HttpServletRequest req,HttpServletResponse res,UserCommand cmd){
		return new ModelAndView("result","operation","modify");
	}
	
	public ModelAndView delete(HttpServletRequest req,HttpServletResponse res,UserCommand cmd){
		return new ModelAndView("result","operation","delete");
	}
	
	/*public ModelAndView view(HttpServletRequest req,HttpServletResponse res,UserCommand cmd){
		return new ModelAndView("result","operation","view");
	}*/
	
	public Map<String,String> view(HttpServletRequest req,HttpServletResponse res,UserCommand cmd){
		Map<String,String> model=null;
		model=new HashMap();
		model.put("operation","view");
		return model;
	}
	
	
	public void invalid(HttpServletRequest req,HttpServletResponse res,UserCommand cmd){
		return ;
	}
	
 }//class
