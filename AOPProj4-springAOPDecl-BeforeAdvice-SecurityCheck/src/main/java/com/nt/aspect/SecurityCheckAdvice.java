package com.nt.aspect;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class SecurityCheckAdvice implements MethodBeforeAdvice {
	private AuthenticationManager manager;
	
	public void setManager(AuthenticationManager manager) {
		this.manager = manager;
	}

	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		boolean flag=false;
		//perform security check
		flag=manager.isAuthenticated();
		if(!flag)
			throw new IllegalArgumentException("Authentication Failed");
	}//method
}//class
