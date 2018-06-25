package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.service.TransferMoneyService;

public class DistributedTxMgmtTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		TransferMoneyService proxy=null;
		//create IOC container
		ctx=new FileSystemXmlApplicationContext("src/main/java/com/nt/cfgs/applicationContext.xml");
		//get Proxy
		proxy=ctx.getBean("bankService",TransferMoneyService.class);
		try{
			System.out.println("Money Transffered?"+proxy.transferMoney(1001,1005,2000));
		}
		catch(Exception e){
			System.out.println("Money not Transffered");
			e.printStackTrace();
		}
		
		//close container
		((AbstractApplicationContext) ctx).close();

	}//main
}//class
