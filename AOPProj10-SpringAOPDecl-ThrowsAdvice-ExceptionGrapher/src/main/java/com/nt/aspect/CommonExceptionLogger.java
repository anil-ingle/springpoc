package com.nt.aspect;

import java.lang.reflect.Method;
import java.util.Arrays;

import org.springframework.aop.ThrowsAdvice;

public class CommonExceptionLogger implements ThrowsAdvice {
	
	public void afterThrowing(Method method,Object args[],Object target,Exception e){
		System.out.println("Exception is raised in "+target.getClass()+" in method"+method.getName()+" with args"+Arrays.toString(args)+" and exception is"+e);
		
        throw new InvalidInputsException(e.getMessage());
	}

}
