package com.nt.config;

import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.nt.aspect.DiscountCuponGeneratorAdvice;
import com.nt.service.ShoppingStore;

@Configuration
@ComponentScan(basePackages={"com.nt.service,com.nt.aspect"})
public class AppConfig {
	@Autowired
	private ShoppingStore store;
	
	@Bean(name="pfb")
	public ProxyFactoryBean createProxyFactoryBean(){
		ProxyFactoryBean pfb=null;
		pfb=new ProxyFactoryBean();
		pfb.setTarget(store);
		pfb.setInterceptorNames("cuponAdvice");
		return pfb;
	}
	
	@Bean(name="proxy")
	public  Object createProxyObject(){
		return createProxyFactoryBean().getObject();
	}
	
	

}
