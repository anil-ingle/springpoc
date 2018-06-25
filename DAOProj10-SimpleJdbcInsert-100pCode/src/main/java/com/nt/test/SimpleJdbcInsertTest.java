package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.nt.config.BeanConfigurator;
import com.nt.dto.StudentDTO;
import com.nt.service.StudentService;

public class SimpleJdbcInsertTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		StudentService service=null;
		StudentDTO dto=null;
		//create IOC container
		ctx=new AnnotationConfigApplicationContext(BeanConfigurator.class);
		//get Bean
		service=ctx.getBean("stService",StudentService.class);
		//prepareDTO
		dto=new StudentDTO();
		dto.setSno(10289); dto.setSname("ramesh"); dto.setSadd("vizag");
		//invoke method
		System.out.println(service.registerStudent(dto));
		//close container
	    ((AbstractApplicationContext) ctx).close();
	}//main
}//class
