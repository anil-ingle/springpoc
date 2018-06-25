package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.service.BankService;

public class TransactionTestClient {

	public static void main(String[] args) {
		 ApplicationContext ctx=null;
		 BankService proxy=null;
		//create IOC Container
		 ctx=new FileSystemXmlApplicationContext("src/main/java/com/nt/cfgs/applicationContext.xml");
		 //get Bean
		 proxy=ctx.getBean("tpfb",BankService.class);
		 try{
		 //invoke method...
		 System.out.println("MonenyTranfered?::"+proxy.transferMoney(101, 102, 1000));
		 }
		 catch(Exception re){
			 re.printStackTrace();
			 System.out.println("Money Not Transffered");
		 }
		 //close Container
		 ((AbstractApplicationContext) ctx).close();
	}//main
}//class
