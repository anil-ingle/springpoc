package com.nt.aspect;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.stereotype.Component;

@Component("cacheAdvice")
public class CacheAdvice implements MethodInterceptor {
     private Map<String,Object> cache=new HashMap();
	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		Object retVal=null;
		String key=null;
		//prepare method name with args as the key
		key=invocation.getMethod().getName()+Arrays.toString(invocation.getArguments());
		if(!cache.containsKey(key)){
			retVal=invocation.proceed();
			cache.put(key,retVal);
			System.out.println("from target method");
		}//if
		else{
		 retVal=cache.get(key);	
		 System.out.println("from cache");
		}
		return retVal;
	}//method
}//class
