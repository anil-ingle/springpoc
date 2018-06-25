package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.beans.CheckingVotingElgibility;


public class BeanLifeCycleTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		CheckingVotingElgibility voter=null;
		
		//create IOC container
		ctx=new FileSystemXmlApplicationContext("src/main/java/com/nt/cfgs/applicationContext.xml");
        //get Bean 
		voter=ctx.getBean("voter",CheckingVotingElgibility.class);
		System.out.println(voter.checkElgibility());
		//close/stop container
		((AbstractApplicationContext) ctx).close();
		
	}//main
}//class
