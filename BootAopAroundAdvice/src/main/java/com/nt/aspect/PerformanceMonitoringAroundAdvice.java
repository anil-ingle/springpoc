package com.nt.aspect;

import java.util.Arrays;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.stereotype.Component;

@Component("pmAdvice")
public class PerformanceMonitoringAroundAdvice implements MethodInterceptor {
        private long start=0,end=0;
        
	public Object invoke(MethodInvocation invocation) throws Throwable {
		Object retVal=0;
		//get start time
		 start=System.currentTimeMillis();
		 retVal=invocation.proceed(); //invokes target method
		 //get end time
		 end=System.currentTimeMillis();
		 System.out.println("PMAroundAdvice:"+invocation.getMethod().getName()+
				             " with args"+Arrays.toString(invocation.getArguments())+
				             " has taken"+(end-start)+"ms.");
		  
		 return retVal;
	}//method
}//class
