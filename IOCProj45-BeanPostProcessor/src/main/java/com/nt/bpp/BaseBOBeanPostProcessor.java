package com.nt.bpp;

import java.util.Date;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import com.nt.bo.BaseBO;

public class BaseBOBeanPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("BPP:postProcessBeforInitialization(-)");
		if(bean instanceof BaseBO){
		 ((BaseBO)bean).setDoj(new Date(117,2,28));
		}
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("BPP:postProcessAfterInitialization(-)");
		return bean;
	}

}
