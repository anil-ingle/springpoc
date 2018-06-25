package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.Resource;

import com.nt.beans.WishMsgGenerator;

public class SetterInjectTest {

	public static void main(String[] args) {
		Resource res=null;
		WishMsgGenerator generator=null;
		ApplicationContext ctx=null;
		Object obj=null;
		String result=null;
		//create IOC container
		ctx=new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
		//get Bean
        generator=ctx.getBean("wish",WishMsgGenerator.class);
        //call method
        result=generator.generateWishMsg("raja");
        System.out.println(result); 
        //stop IOC Container
        ((AbstractApplicationContext) ctx).close();
	}//main
}//class
