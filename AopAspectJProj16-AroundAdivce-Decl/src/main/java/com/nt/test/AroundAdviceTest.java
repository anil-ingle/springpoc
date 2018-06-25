package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.service.IntrAmountCalculator;

public class AroundAdviceTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		IntrAmountCalculator proxy=null;
		//create IOCContainer
		ctx=new FileSystemXmlApplicationContext("src/main/java/com/nt/cfgs/applicationContext.xml");
		//getBean
		proxy=ctx.getBean("iac",IntrAmountCalculator.class);
		
		System.out.println("proxy object class name::"+proxy.getClass());
		System.out.println("..................................");
		
		System.out.println("Simple Intr Amount::"+proxy.calcSimpleIntrAmount(100000,2, 20));
		System.out.println("..................................");
		
		System.out.println("Simple Intr Amount::"+proxy.calcSimpleIntrAmount(40000,2, 20));
		System.out.println("..................................");
		
		System.out.println("Compound Intr Amount::"+proxy.calcCompoundIntrAmount(100000,2,20));
		System.out.println("..................................");
		System.out.println("Compound Intr Amount::"+proxy.calcCompoundIntrAmount(45000,2,20));
		System.out.println("..................................");
		
		
		
		//close container
		((AbstractApplicationContext) ctx).close();
	}

}
