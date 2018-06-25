package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;


import com.nt.beans.IntrAmtCalculator;

public class PropertyEditorsTest_AC {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
        IntrAmtCalculator calculator=null;
		//create IOC container
		ctx=new FileSystemXmlApplicationContext("src/main/java/com/nt/cfgs/applicationContext.xml");
		//get Bean
		calculator=ctx.getBean("iac",IntrAmtCalculator.class);
		//display details
		System.out.println("Intr Amount::"+calculator.calcIntrAmount());
		//close IOC container
		((AbstractApplicationContext) ctx).close();
	}//main
}//class
