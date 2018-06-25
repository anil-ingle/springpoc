package com.nt.replacer;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class IntrRateReplacer implements MethodReplacer {
	

	@Override
	public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
		float pAmt=0;
		float time=0;
		//read method arg values
		pAmt=((Float)args[0]);
		time=((Float)args[1]);
		//write new logic
		System.out.println("Method replacer's new logic");
				
		return (pAmt*time*1)/100;
	}

}
