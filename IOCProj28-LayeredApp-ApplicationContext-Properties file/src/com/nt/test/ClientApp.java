package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.controller.StudentController;

public class ClientApp {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		String result=null;
		StudentController controller=null;
		//create IOC Container
		ctx=new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
		//get Bean
		controller=ctx.getBean("stController",StudentController.class);
		try{
		 result=controller.processStudentInfo("9622","bahubali2","45.23" ,"45.44","36.66");
		 System.out.println(result);
		}
		catch(Exception e){
			System.out.println("Internal Problem:::"+e.getMessage());
		}

	}//main
}//class
