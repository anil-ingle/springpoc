package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.dto.EmployeeDTO;
import com.nt.service.EmployeeService;

public class TestClient {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		EmployeeService service=null;
		EmployeeDTO dto=null;
		//create IOC container
		ctx=new FileSystemXmlApplicationContext("src/main/java/com/nt/cfgs/applicationContext.xml");
		//get Bean
		service=ctx.getBean("empService",EmployeeService.class);
		//prepare DTO
		dto=new EmployeeDTO();
		dto.setFirstName("fraja"); dto.setLastName("lraja");dto.setEmail("mail.raja@gmail.com");
		//invoke B.method
		//System.out.println(service.registerEmployee(dto));
		//System.out.println("All Emp Details::"+service.fetchAllEmployees());
		//System.out.println(service.modifyEmailByNo(1, "raja@King.com"));
		//System.out.println(service.removeEmployeeByLastName("lraja"));
		//System.out.println(service.fetchEmployeesByEmailDomain("gmail.com"));
		System.out.println(service.fetchEmployeesByLastName("rao","chari","reddy"));
		//close container
		((AbstractApplicationContext) ctx).close();
	}

}
