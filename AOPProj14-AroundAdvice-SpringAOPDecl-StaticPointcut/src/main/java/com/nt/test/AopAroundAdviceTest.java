package com.nt.test;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import com.nt.service.ArithmeticOperations;

public class AopAroundAdviceTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		ArithmeticOperations proxy=null;
		//create IOC container
		ctx=new FileSystemXmlApplicationContext("src/main/java/com/nt/cfgs/applicationContext.xml");
		//get Proxy Object
		proxy=ctx.getBean("pfb",ArithmeticOperations.class);
		//invoke methods
		System.out.println("sum::"+proxy.sum(10,20));
		System.out.println("----------------------------");
		System.out.println("sub::"+proxy.sub(10,20));
		System.out.println("----------------------------");
		System.out.println("mul::"+proxy.mul(50,60));
		
		//close container
		((AbstractApplicationContext) ctx).close();
	}//main
}//class
