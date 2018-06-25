package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;


import com.nt.beans.WishMsgGenerator;

public class AutowiredAnnotionTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		WishMsgGenerator generator=null;
		//create IOC container
		ctx=new FileSystemXmlApplicationContext("src/main/java/com/nt/cfgs/applicationContext.xml");
        //get Bean
		generator=ctx.getBean("wish",WishMsgGenerator.class);
		System.out.println("Wish Message:::"+generator.sayHello("raja"));
		
		//close container
		((AbstractApplicationContext) ctx).close();
		
		
	}

}
