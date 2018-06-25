package com.nt.aspect;

import java.util.Arrays;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class PerformanceMonitoringAdvice {
	 private long start,end;
	 
    @Around(value="execution(* com.nt.service.IntrAmountCalculator.*(..))")
	public Object monitor(ProceedingJoinPoint pjp)throws Throwable{
		Object retVal=null;
		start=System.currentTimeMillis();
		retVal=pjp.proceed();
		end=System.currentTimeMillis();
		System.out.println("PMAdvice:"+pjp.getSignature()+"with args"+Arrays.toString(pjp.getArgs())+" has taken"+(end-start)+" ms");
		return retVal;
	}

}
