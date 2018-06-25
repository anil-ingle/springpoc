package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.beans.Viechle;

public class AwareInjectionBasedDependencyLookupTest {

	public static void main(String[] args) {
		System.out.println("main(-)");
		ApplicationContext ctx=null;
		Viechle viechle=null;
		//create IOC container
		ctx=new FileSystemXmlApplicationContext("src/main/java/com/nt/cfgs/applicationContext.xml");
		//get Bean
		viechle=ctx.getBean("viechle",Viechle.class);
		viechle.move();
		System.out.println("------------------");
		viechle.entertainment();
		System.out.println("--------------------");
		viechle.soundHorn();
		System.out.println("----------------------");
		((AbstractApplicationContext) ctx).close();
	}//main
}//class
