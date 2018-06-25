package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.dto.StudentDTO;
import com.nt.service.StudentService;

public class SimpleJdbcInsertTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		StudentService service=null;
		StudentDTO dto=null;
		//create IOC container
		ctx=new FileSystemXmlApplicationContext("src/main/java/com/nt/cfgs/applicationContext.xml");
		//get Bean
		service=ctx.getBean("stService",StudentService.class);
		//prepareDTO
		dto=new StudentDTO();
		dto.setSno(1021); dto.setSname("ramesh"); dto.setSadd("vizag");
		//invoke method
		System.out.println(service.registerStudent(dto));
		//close container
	    ((AbstractApplicationContext) ctx).close();
	}//main
}//class
