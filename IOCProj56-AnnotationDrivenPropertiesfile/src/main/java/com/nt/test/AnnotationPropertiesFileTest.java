package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.beans.DBOperations;

public class AnnotationPropertiesFileTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		DBOperations operations=null;
		//create IOC container
		ctx=new FileSystemXmlApplicationContext("src/main/java/com/nt/cfgs/applicationContext.xml");
		//get Bean
		operations=ctx.getBean("db",DBOperations.class);
		System.out.println(operations.makeConnection());
		//close container
		((AbstractApplicationContext) ctx).close();

	}//main
}//class
