package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.service.StudentService;

public class MappingSQLOperationsTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		StudentService service=null;
		//create IOC container
		ctx=new FileSystemXmlApplicationContext("src/main/java/com/nt/cfgs/applicationContext.xml");
		//get Service Bean
		service=ctx.getBean("stService",StudentService.class);
		//invoke methods
		System.out.println("Student Details::"+service.findStudentByNO(222));
		System.out.println("-------------------------------------------------");
		System.out.println("hyd city students:::"+service.findStudentsByAddrs("hyd"));
		System.out.println("----------------------------------------------");
		System.out.println(service.modifyStudentDetailsByNo("newRaja","new hyd" ,222));
		//close container
		((AbstractApplicationContext) ctx).close();
	}//main
}//class
