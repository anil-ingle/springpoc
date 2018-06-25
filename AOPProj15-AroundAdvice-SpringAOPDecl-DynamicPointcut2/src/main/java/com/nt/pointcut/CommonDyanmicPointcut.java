package com.nt.pointcut;

import java.lang.reflect.Method;

import org.springframework.aop.support.DynamicMethodMatcherPointcut;

import com.nt.service.ArithmeticOperations;

public class CommonDyanmicPointcut extends DynamicMethodMatcherPointcut {

	@Override
	public boolean matches(Method method, Class<?> clazz, Object[] args) {
		if(clazz==ArithmeticOperations.class && method.getName().equals("sum") &&
				   (((Integer)args[0])>=1000 && (((Integer)args[1])>=1000)))
		   return true;
		else
		   return false;
	}

}
