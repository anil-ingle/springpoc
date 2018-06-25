package com.nt.initiaizer;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.nt.config.RootAppConfig;
import com.nt.config.WebMvcAppConfig;

public class MyWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	public Class<?>[] getRootConfigClasses() {
		return new Class[]{RootAppConfig.class};  //for parent container
	}

	@Override
	public Class<?>[] getServletConfigClasses() {
		return new Class[]{WebMvcAppConfig.class};  //for child container
	}

	@Override
	public String[] getServletMappings() {
		return new String[]{"*.htm"};  //for url pattern of DispatcherServlet
	}
	
	@Override
	public String getServletName() {
		return "dispatcher";  //for logical name..
	}
}//class
