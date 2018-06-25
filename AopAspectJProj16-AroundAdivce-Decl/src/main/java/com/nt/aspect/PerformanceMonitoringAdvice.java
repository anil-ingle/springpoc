package com.nt.aspect;

import java.util.Arrays;

import org.aspectj.lang.ProceedingJoinPoint;

public class PerformanceMonitoringAdvice {
	 private long start,end;
	public Object monitor(ProceedingJoinPoint pjp)throws Throwable{
		Object retVal=null;
		start=System.currentTimeMillis();
		retVal=pjp.proceed();
		end=System.currentTimeMillis();
		System.out.println("PMAdvice:"+pjp.getSignature()+"with args"+Arrays.toString(pjp.getArgs())+" has taken"+(end-start)+" ms");
		return retVal;
	}

}
