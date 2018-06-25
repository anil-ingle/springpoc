package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.beans.IntrAmtCalculatorService;

public class MethodReplacerTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		IntrAmtCalculatorService service=null;
		//create IOC container
		ctx=new FileSystemXmlApplicationContext("src/main/java/com/nt/cfgs/applicationContext.xml");
		//get Bean 
		service=ctx.getBean("iac",IntrAmtCalculatorService.class);
		
		System.out.println("Service obj class name"+service.getClass());
		//Invoke B.method
		System.out.println("Intr Amount is::"+service.calcIntrAmt(30000,20));
		System.out.println("----------------------------------------------");
		System.out.println("Intr Amount is::"+service.calcIntrAmt(30000,20,2));
		//close container
		((AbstractApplicationContext) ctx).close();

	}

}
