package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.beans.TestBean;

public class ClientApp {

	public static void main(String[] args) {
	 ApplicationContext ctx=null;
	 TestBean bean=null;
	 //create IOC container
	 ctx=new FileSystemXmlApplicationContext("src/main/java/com/nt/cfgs/applicationContext.xml");
	 //get Bean
	 bean=ctx.getBean("tb",TestBean.class);
	 
	 //close container
	 ((AbstractApplicationContext) ctx).close();
	 

	}

}
