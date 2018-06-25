package com.nt.aspect;

import java.util.Arrays;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class LogAroundAdvice implements MethodInterceptor {
	
	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
        Object retVal=null;
        Object args[]=null;
        System.out.println("Entering into"+invocation.getMethod().getName()+" with args"+Arrays.toString(invocation.getArguments()));
        args=invocation.getArguments();
         //moditying arg values        
        if(((Float)args[0])<50000){
        	args[2]=((Float)args[2])-0.50f;
        }
        //skip target method execution for invalid inputs
        if(((Float)args[0])<=0 || ((Float)args[1])<=0 || ((Float)args[2])<=0){
        	throw new IllegalArgumentException("invalid inputs");
        }
        else{
          retVal=invocation.proceed();
        }
        System.out.println("Exited from"+invocation.getMethod().getName()+" with args"+Arrays.toString(invocation.getArguments()));
        //modifying return value
        retVal=((Float)retVal)+(((Float)retVal)*0.18f);
		return retVal;
	}//method
}//class
