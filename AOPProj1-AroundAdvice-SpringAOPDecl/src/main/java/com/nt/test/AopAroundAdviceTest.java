package com.nt.test;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.service.IntrAmtCalculator;

public class AopAroundAdviceTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		IntrAmtCalculator proxy=null;
		//create IOC container
		ctx=new FileSystemXmlApplicationContext("src/main/java/com/nt/cfgs/applicationContext.xml");
		//get Proxy Object
		proxy=ctx.getBean("pfb",IntrAmtCalculator.class);
		//invoke methods
		System.out.println("Client: Intr Amount:"+proxy.calcIntrAmount(20000, 20,2));
		System.out.println("-----------------------------------------------");
		System.out.println("Client: Intr Amount:"+proxy.calcIntrAmount(20000, 20,2));
		
		System.out.println("proxy object class"+proxy.getClass());
		System.out.println("super class of proxy"+proxy.getClass().getSuperclass());
		//close container
		((AbstractApplicationContext) ctx).close();
	}//main
}//class
