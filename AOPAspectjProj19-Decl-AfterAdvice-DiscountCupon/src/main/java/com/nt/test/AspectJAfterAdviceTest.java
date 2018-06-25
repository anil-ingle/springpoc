package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import com.nt.service.ShoppingMall;

public class AspectJAfterAdviceTest {

	public static void main(String[] args) {
		ShoppingMall proxy=null;
		ApplicationContext ctx=null;
		//create IOC container
		ctx=new FileSystemXmlApplicationContext("src/main/java/com/nt/cfgs/applicationContext.xml");
		//get Bean
		proxy=ctx.getBean("mall",ShoppingMall.class);
		//display results
		System.out.println("Bill Amount:::"+proxy.shopping(new String[]{"cool drinks","maleon","cap","navaratan"},100));
		//close IOC container
		((AbstractApplicationContext) ctx).close();
	}//main
}//class
