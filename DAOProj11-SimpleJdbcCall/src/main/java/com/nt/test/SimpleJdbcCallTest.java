package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.service.AuthenticateService;

public class SimpleJdbcCallTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		AuthenticateService service=null;
	   //create IOC container
		ctx=new FileSystemXmlApplicationContext("src/main/java/com/nt/cfgs/applicationContext.xml");
		//get Service Bean
		service=ctx.getBean("authService",AuthenticateService.class);
		System.out.println(service.validate("raja","rani"));
		
		//close container
		((AbstractApplicationContext) ctx).close();
		
	}

}
