package com.nt.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyPostProcessor implements BeanPostProcessor {
	
	@Override
	public Object postProcessBeforeInitialization(Object bean, String id) throws BeansException {
		System.out.println("postProcessBeforInitialization(-,-)");
		return bean;
	}
	@Override
	public Object postProcessAfterInitialization(Object bean, String id) throws BeansException {
		System.out.println("postProcessAfterInitialization(-,-)");
		return bean;
	}

}
