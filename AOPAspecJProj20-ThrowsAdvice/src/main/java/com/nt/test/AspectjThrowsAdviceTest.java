package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.service.Shopping;

public class AspectjThrowsAdviceTest {
	
	public static void main(String[] args) {
		ApplicationContext ctx=null;
		Shopping proxy=null;
		//create IOC container
		ctx=new FileSystemXmlApplicationContext("src/main/java/com/nt/cfgs/applicationContext.xml");
		//get Proxy object
		proxy=ctx.getBean("shopping",Shopping.class);
		//invoke method
		System.out.println("Bill Amount::"+proxy.calcBillAmt(2000,0));
		//close container
		((AbstractApplicationContext) ctx).close();
		
	}//main
}//class
