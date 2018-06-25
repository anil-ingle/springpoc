package com.nt.test;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.service.IntrAmtCalculator;
import com.nt.service.IntrAmtCalculatorInterface;

public class AopAroundAdviceTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		IntrAmtCalculatorInterface proxy=null;
		//create IOC container
		ctx=new FileSystemXmlApplicationContext("src/main/java/com/nt/cfgs/applicationContext.xml");
		//get Proxy Object
		proxy=ctx.getBean("pfb",IntrAmtCalculatorInterface.class);
		//invoke methods
		System.out.println("Client: Intr Amount:"+proxy.calcIntrAmt(20000, 20,2));
		System.out.println("-----------------------------------------------");
		System.out.println("Client: Intr Amount:"+proxy.calcIntrAmt(20000, 20,2));
		System.out.println(".............................................");
		System.out.println("class name of proxy object"+proxy.getClass());
		System.out.println("super class of proxy class"+proxy.getClass().getSuperclass());
		System.out.println("Implemented interfaces"+Arrays.toString(proxy.getClass().getInterfaces()));
		//close container
		((AbstractApplicationContext) ctx).close();
	}//main
}//class
