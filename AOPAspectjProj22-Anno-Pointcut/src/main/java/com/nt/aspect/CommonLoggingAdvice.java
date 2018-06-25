package com.nt.aspect;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class CommonLoggingAdvice {
	
	@Pointcut(value="execution(* com.nt.service.ArithmeticOperations.*(..))")
	public void myPointcut(){}
	
	@Around(value="myPointcut()")
	public Object around(ProceedingJoinPoint pjp)throws Throwable{
		Object retVal=null;
		System.out.println("Entering into "+pjp.getSignature()+"with args"+Arrays.toString(pjp.getArgs()));
		retVal=pjp.proceed();
		System.out.println("Exited from "+pjp.getSignature()+"with args"+Arrays.toString(pjp.getArgs()));
		return retVal;
	}
	
	@Before(value="myPointcut()")
	public void before(JoinPoint jp){
		System.out.println("Before Entering into "+jp.getSignature()+"with args"+Arrays.toString(jp.getArgs()));
	}
	
	@AfterReturning(value="myPointcut()",returning="retVal")
	public void after(JoinPoint jp,int retVal){
		System.out.println("after exucuting "+jp.getSignature()+"with args"+Arrays.toString(jp.getArgs())+"the return value"+retVal);
	}
	
	@AfterThrowing(value="myPointcut()",throwing="ex")
	public void throwing(JoinPoint jp,Exception ex){
		System.out.println("Exception is raised in "+jp.getSignature()+"with args"+Arrays.toString(jp.getArgs())
		                   +"the exception is"+ex);
	}
	

}
