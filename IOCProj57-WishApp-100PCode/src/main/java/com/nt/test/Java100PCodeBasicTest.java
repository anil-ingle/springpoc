package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.nt.beans.WishMsgGenerator;
import com.nt.config.BeanConfigurator;

public class Java100PCodeBasicTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		WishMsgGenerator generator=null;
		//create IOC container
		ctx=new AnnotationConfigApplicationContext(BeanConfigurator.class);
		//get bean
		generator=ctx.getBean("wish",WishMsgGenerator.class);
		//invoke method
		System.out.println(generator.generate("raja"));
		
		//close container
		((AbstractApplicationContext) ctx).close();
		

	}

}
