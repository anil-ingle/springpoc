package com.nt.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractWizardFormController;

public class RegisterController extends AbstractWizardFormController {

	@Override
	public ModelAndView processFinish(HttpServletRequest req, HttpServletResponse res, Object cmd,
			BindException be) throws Exception {
		//Acually we need to Convert Cmd obj to DTO obj and needs to send to Service class
		//But here we are just keeping Cmd obj in model attribute check wheather all 3 forms
		// data is stored or not.
		return new  ModelAndView("result","cmdData",cmd);
	}
	
	@Override
	public ModelAndView processCancel(HttpServletRequest request, HttpServletResponse response, Object cmd,
			BindException errors) throws Exception {
		return new ModelAndView("page1Form","regCmd",cmd);
	}

}
