package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.beans.Robot;

public class RequiredAnnotionTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		Robot robot=null;
		//create IOC container
		ctx=new FileSystemXmlApplicationContext("src/main/java/com/nt/cfgs/applicationContext.xml");
        //get Bean
		robot=ctx.getBean("robot",Robot.class);
		System.out.println("Robot Details:::"+robot);
		
		//close container
		((AbstractApplicationContext) ctx).close();
		
		
	}

}
