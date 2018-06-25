package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.aspect.AuthenticationManager;
import com.nt.service.IntrAmtCalculator;

public class BeforeSecurityAdviceTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		AuthenticationManager authManager=null;
		IntrAmtCalculator proxy=null;
		//create IOC container
		ctx=new FileSystemXmlApplicationContext("src/main/java/com/nt/cfgs/applicationContext.xml");
		//get AuthenticationManager Bean object
		authManager=ctx.getBean("authManager",AuthenticationManager.class);
		//perform siginIn operation
		authManager.singIn("raja","rani");
		//Get proxy object
		proxy=ctx.getBean("pfb",IntrAmtCalculator.class);
		//invoke method
		System.out.println("Intr Amount::"+proxy.calcIntrAmount(20000,10,20));
		//perform singnOut Opeartion
		authManager.signOut();
		//close container
		((AbstractApplicationContext) ctx).close();
	}

}
