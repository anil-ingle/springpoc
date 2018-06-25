package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.service.IntrAmountCalculator;

public class AnnoAspectJAOPAroundAdvice {
	
	public static void main(String[] args) {
		ApplicationContext ctx=null;
		IntrAmountCalculator proxy=null;
		//create IOC container
		ctx=new FileSystemXmlApplicationContext("src/main/java/com/nt/cfgs/applicationContext.xml");
		//get Proxy 
		proxy=ctx.getBean("iac",IntrAmountCalculator.class);
		System.out.println("Simple IntrAmount:::"+proxy.calcSimpleIntrAmount(100000,2,20));
		System.out.println("-------------------------------------------------------");
		System.out.println("Simple IntrAmount:::"+proxy.calcSimpleIntrAmount(100000,2,20));
		
		System.out.println("-------------------------------------------------------");
		System.out.println("Compound IntrAmount:::"+proxy.calcCompoundIntrAmount(100000,2,20));
		System.out.println("-------------------------------------------------------");
		System.out.println("Compound IntrAmount:::"+proxy.calcCompoundIntrAmount(100000,2,20));
		//close container
		((AbstractApplicationContext) ctx).close();
	}

}
