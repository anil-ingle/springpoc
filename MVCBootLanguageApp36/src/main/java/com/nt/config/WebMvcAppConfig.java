package com.nt.config;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerMapping;
import org.springframework.web.servlet.handler.SimpleUrlHandlerMapping;
import org.springframework.web.servlet.mvc.Controller;
import org.springframework.web.servlet.mvc.ParameterizableViewController;

@Configuration
@ComponentScan(basePackages="com.nt.controller")
public class WebMvcAppConfig {
	
	@Bean
	public HandlerMapping createSUHMapping(){
		SimpleUrlHandlerMapping suh=null;
		Properties props=null;
		
		suh=new SimpleUrlHandlerMapping();
		suh.setOrder(Integer.MAX_VALUE-2);
		props=new Properties();
		props.setProperty("/home.htm", "pvc");
		suh.setMappings(props);
		return suh;
	}
	
	@Bean(name="pvc")
	public Controller  createPVController(){
		ParameterizableViewController pvc=null;
		pvc=new ParameterizableViewController();
		pvc.setViewName("home");
		return pvc;
	}

}
