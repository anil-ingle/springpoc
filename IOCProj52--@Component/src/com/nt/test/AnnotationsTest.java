package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.beans.Flipkart;

public class AnnotationsTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		Flipkart flipkart=null,flipkart1=null;
		String billSlip=null;
		//create IOC container
		ctx=new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
		//get Bean
	/*	flipkart=ctx.getBean("flipkart",Flipkart.class);
		//invoke method
		billSlip=flipkart.shopping(new String[]{"neem flowers","green mango","sugar","water"});
		System.out.println(billSlip);
		
		flipkart1=ctx.getBean("flipkart",Flipkart.class);
		
		System.out.println(flipkart.hashCode()+"   "+flipkart1.hashCode());
		
		//close container
		((AbstractApplicationContext) ctx).close();*/
		
		
	}//main
}//class
