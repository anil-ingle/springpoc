package com.nt.aspect;

import java.util.Arrays;

import org.aspectj.lang.ProceedingJoinPoint;

public class LogAroundAdvice {
	
	public Object log(ProceedingJoinPoint pjp)throws Throwable{
		Object retVal=null;
		Object args[]=null;
		
		System.out.println("Entering into "+pjp.getSignature()+" with args"+Arrays.toString(pjp.getArgs()));
	    //get target method args
		args=pjp.getArgs();
		if((Float)args[0]<50000)
			args[1]=((Float)args[1])-0.5f;
		
		if((Float)args[0]==0 || (Float)args[1]==0 || (Float)args[2]==0)
			throw new IllegalArgumentException("Zeros are not allowed...");
			
		  retVal=pjp.proceed(args);
		
		//change method return value
		retVal=((Float)retVal)+((Float)retVal)*0.01f;
		
		System.out.println("Exiting from "+pjp.getSignature()+"with args"+Arrays.toString(pjp.getArgs()));
        return retVal;		
	}//log
}//class
