package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.controller.CrickBuzzFindScoreController;

public class ServiceLocatorStaticFactoryMethodTest {
   
	public static void main(String[] args) {
		ApplicationContext ctx=null;
		CrickBuzzFindScoreController controller=null;
		//create IOC Container
		ctx=new FileSystemXmlApplicationContext("src/main/java/com/nt/cfgs/applicationContext.xml");
		//get Bean
		controller=ctx.getBean("cbController",CrickBuzzFindScoreController.class);
		System.out.println(controller.viewScore(1001));
		//close container
		((AbstractApplicationContext) ctx).close();
	}//main
}//class
