package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.service.BankLoanApprover;
import com.nt.service.BankLoanApproverInterface;

public class AspectJBeforeAdviceTest {

	public static void main(String[] args) {
		BankLoanApproverInterface proxy=null;
		ApplicationContext ctx=null;
		//create IOC container
		ctx=new FileSystemXmlApplicationContext("src/main/java/com/nt/cfgs/applicationContext.xml");
		//get Bean
		proxy=ctx.getBean("loanApprover",BankLoanApproverInterface.class);
		System.out.println("proxy object class name::"+proxy.getClass()+"super class"+proxy.getClass().getSuperclass());
		//display results
		System.out.println(proxy.approveLoan(2345,"agriculture"));
		
		//close IOC container
		((AbstractApplicationContext) ctx).close();
	}//main
}//class
