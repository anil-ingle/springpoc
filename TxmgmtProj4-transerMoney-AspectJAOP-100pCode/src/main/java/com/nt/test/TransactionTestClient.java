package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.config.AppConfig;
import com.nt.service.BankService;

public class TransactionTestClient {

	public static void main(String[] args) {
		 ApplicationContext ctx=null;
		 BankService proxy=null;
		//create IOC Container
		 ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		 //get Bean
		 proxy=ctx.getBean("bankService",BankService.class);
		 try{
		 //invoke method...
		  System.out.println("MonenyTranfered?::"
		                   +proxy.transferMoney(101, 104, 1000));
		 }
		 catch(Exception re){
			 re.printStackTrace();
			 System.out.println("Money Not Transffered");
		 }
		 //close Container
		 ((AbstractApplicationContext) ctx).close();
	}//main
}//class
