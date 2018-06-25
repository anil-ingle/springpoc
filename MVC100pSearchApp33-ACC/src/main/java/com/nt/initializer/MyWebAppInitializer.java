package com.nt.initializer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import com.nt.config.RootAppConfig;
import com.nt.config.WebMvcAppConfig;

public class MyWebAppInitializer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext sc) throws ServletException {
		
		AnnotationConfigWebApplicationContext rootCtx=null,webCtx=null;
		 ContextLoaderListener listener=null;
		 DispatcherServlet servlet=null;
		 ServletRegistration.Dynamic registration=null;
		 //create root Container , web application context container
		 rootCtx=new AnnotationConfigWebApplicationContext();
		 rootCtx.register(RootAppConfig.class);
		 webCtx=new AnnotationConfigWebApplicationContext();
		 webCtx.register(WebMvcAppConfig.class);
		 
		 //create ContextLoaderListener having Root ApplicationContext contianer
		 listener=new ContextLoaderListener(rootCtx);
		 sc.addListener(listener);
		 //create DispatcherServlet having WebApplicationContext container
		 servlet=new DispatcherServlet(webCtx);
		 registration=sc.addServlet("dispatcher",servlet);
		 registration.setLoadOnStartup(1);
		 registration.addMapping("*.htm");
	}//onStartup(-,-)
}//class
