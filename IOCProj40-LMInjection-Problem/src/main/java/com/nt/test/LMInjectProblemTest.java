package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.beans.MyServletContainer;

public class LMInjectProblemTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		MyServletContainer container=null,container1=null;
		//create IOC container
		ctx=new FileSystemXmlApplicationContext("src/main/java/com/nt/cfgs/applicationContext.xml");
		//get Bean
		container=ctx.getBean("container",MyServletContainer.class);
		//process request
		container.processRequest("hello1");
		System.out.println("--------------------");
		container1=ctx.getBean("container",MyServletContainer.class);
		container1.processRequest("hello2");
		//close container
		((AbstractApplicationContext) ctx).close();
	}//main
}//class
