package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.WishMsgGenerator;

public class SetterInjectTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		WishMsgGenerator wish=null;
		//create IOC container
		//ctx=new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
		//ctx=new ClassPathXmlApplicationContext("/com/nt/cfgs/applicationContext.xml");
		ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		//get Bean
		wish=ctx.getBean("wish",WishMsgGenerator.class);
		System.out.println("message="+wish.generateWishMsg("raja"));
		//close container
		((AbstractApplicationContext) ctx).close();
   }//main
}//class
