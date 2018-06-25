package com.nt.config;

import java.util.Date;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.nt.beans")
public class BeanConfigurator {
	
	@Bean(name="dt")
	public Date createDate(){
		return new Date();
	}

}
