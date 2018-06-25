package com.nt.aspect;

import java.util.Arrays;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class PerformanceMonitoringAdvice implements MethodInterceptor {
      private long start=0,end=0;
	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		Object retVal=0;
		start=System.currentTimeMillis();
		retVal=invocation.proceed();
		end=System.currentTimeMillis();
		System.out.println(invocation.getMethod().getName()+
				" with args"+Arrays.toString(invocation.getArguments())+
				 "has taken"+(end-start)+" ms");		
		return retVal;
	}

}
