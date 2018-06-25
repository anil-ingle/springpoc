package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.dto.EmployeeDTO;
import com.nt.service.EmployeeService;

public class NamedParameterJdbcTemplateTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		EmployeeService service=null;
		EmployeeDTO dto=null;
		//create IOC container
		ctx=new FileSystemXmlApplicationContext("src/main/java/com/nt/cfgs/applicationContext.xml");
		//get bean
		service= ctx.getBean("empService",EmployeeService.class);
		//invoke methods
		System.out.println("7499 emp name::"+service.findEmployeeNameByNo(7499));
		System.out.println("7499 emp details"+service.findEmployeeByNo(7499));
		
		dto=new EmployeeDTO();
		dto.setEno(1111);dto.setEname("raja"); 
		dto.setDesg("CLERK");
		dto.setSalary(90000);
		System.out.println("Emp Registered?"+service.registerEmp(dto));
		
		//close container
		((AbstractApplicationContext) ctx).close();
		
	}//main
}//class
