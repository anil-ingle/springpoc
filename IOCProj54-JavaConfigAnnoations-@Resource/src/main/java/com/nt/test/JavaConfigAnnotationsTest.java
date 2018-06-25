package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.beans.Flipkart;

public class JavaConfigAnnotationsTest {
	public static void main(String[] args) {
		ApplicationContext ctx=null;
	    Flipkart kart=null;	
		//create IOC container
		ctx=new FileSystemXmlApplicationContext("src/main/java/com/nt/cfgs/applicationContext.xml");
		//get Bean
		kart=ctx.getBean("flipkart",Flipkart.class);
		//invoke method
		System.out.println("Bill Deteails:::"+kart.shopping(new String[]{"watch","shirt","trouser","goggles","shoes"}));
		
		//close container
		((AbstractApplicationContext) ctx).close();
		
		
	}

}
