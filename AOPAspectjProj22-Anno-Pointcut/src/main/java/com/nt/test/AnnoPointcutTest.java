package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.service.ArithmeticOperations;

public class AnnoPointcutTest {

	public static void main(String[] args) {
		ArithmeticOperations proxy=null;
		ApplicationContext ctx=null;
		
		//create IOC container
		ctx=new FileSystemXmlApplicationContext("src/main/java/com/nt/cfgs/applicationContext.xml");
		//get Proxy object
		proxy=ctx.getBean("arithService",ArithmeticOperations.class);
		//invoke methods
		System.out.println("Add=="+proxy.add(10,20));
		System.out.println("--------------------------------");
		System.out.println("Sub=="+proxy.sub(20,30));
		System.out.println("--------------------------------");
		System.out.println("Mul=="+proxy.mul(20,30));
		System.out.println("--------------------------------");
		System.out.println("Div=="+proxy.div(20,10));
		System.out.println("--------------------------------");
		System.out.println("Div=="+proxy.div(20,0));
		System.out.println("--------------------------------");
		
		//close container
		((AbstractApplicationContext) ctx).close();
	}//main
}//class
