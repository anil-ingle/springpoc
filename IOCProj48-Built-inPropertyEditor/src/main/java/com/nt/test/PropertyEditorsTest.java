package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.beans.AadharDetails;

public class PropertyEditorsTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
        AadharDetails details=null;		
		//create IOC container
		ctx=new FileSystemXmlApplicationContext("src/main/java/com/nt/cfgs/applicationContext.xml");
		//get Bean
		details=ctx.getBean("indiaCard",AadharDetails.class);
		//display details
		System.out.println(details);
	}//main
}//class
