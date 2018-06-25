package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.service.LoanApprover;

public class BeforeAdviceTest {

	public static void main(String[] args) {
		LoanApprover proxy=null;
		ApplicationContext ctx=null;
		
		//create IOC container
		ctx=new FileSystemXmlApplicationContext("src/main/java/com/nt/cfgs/applicationContext.xml");
		//get Proxy object
		proxy=ctx.getBean("pfb",LoanApprover.class);
		//invoke methods
		System.out.println(proxy.approveLoan(000, "manager ravi","viechle"));
		//close container
		((AbstractApplicationContext) ctx).close();
		
	}//main
}//class
