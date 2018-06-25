package com.nt.aspect;

import java.util.Arrays;
import java.util.HashMap;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class CacheAdvice {
	private HashMap<String,Object> cache= new HashMap();
	
	@Around(value="execution (float com.nt.service.IntrAmountCalculator.*(..))")
	public Object getCache(ProceedingJoinPoint pjp) throws Throwable{
		Object retVal =0;
		String key = null;
		
		key =pjp.getSignature()+""+Arrays.toString(pjp.getArgs());
		if(!cache.containsKey(key)){
			System.out.println("from target method");
			retVal = pjp.proceed();
			cache.put(key, retVal);
			return retVal;
		}
		else {
			System.out.println("From cache");
			return cache.get(key);
		}
	}//method
}//class
