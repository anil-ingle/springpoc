package com.nt.initializer;

import java.util.Set;

import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import com.nt.servlet.TestServlet;

public class MyWebAppInitializer implements ServletContainerInitializer {

	static{
		System.out.println("static block : MyWebInitializer");
	}
	public MyWebAppInitializer() {
		System.out.println("0-param constructor::MyWebInitializer");
	}
	
	@Override
	public void onStartup(Set<Class<?>> set, ServletContext sc) throws ServletException {
		System.out.println("MyWebInitializer::onStartup(-,-)");
		TestServlet ts=null;
		ServletRegistration.Dynamic registration=null;
		//register Servlet
		ts=new TestServlet();
		registration=sc.addServlet("test",ts);
		registration.addMapping("/testurl");
	}

}
