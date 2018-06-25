package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.service.ShoppingStore;

public class AfterAdviceTest {

	public static void main(String[] args) {
		ShoppingStore proxy=null;
		ApplicationContext ctx=null;
		float billAmt=0.0f;
		//create IOC container
		ctx=new FileSystemXmlApplicationContext("src/main/java/com/nt/cfgs/applicationContext.xml");
		//get Proxy object
		proxy=ctx.getBean("pfb",ShoppingStore.class);
		//invoke method
		billAmt=proxy.generateBill(new String[]{"bahubali ticket","b-t-shirt","b-popcorn"},new float[]{3000,30000,400});
		System.out.println("Bill Amt::"+billAmt);
		//close container
		((AbstractApplicationContext) ctx).close();
	}//main
}//class
