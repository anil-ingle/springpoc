package com.nt.config;

import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.nt.service.IntrAmtCalculator;

@Configuration
@ComponentScan(basePackages="com.nt.aspect")
public class AopConfig {
	
	@Autowired
	private IntrAmtCalculator iac;
	
	@Bean("pfb")
	public ProxyFactoryBean createProxyFactoryBean(){
		ProxyFactoryBean pfb=null;
		pfb=new ProxyFactoryBean();
		pfb.setTarget(iac);
		pfb.setInterceptorNames("cacheAdvice","logAdvice","pmAdvice");
		return pfb;
	}
	
	@Bean("proxy")
	public Object createProxy(){
		return createProxyFactoryBean().getObject();
	}

}//class
