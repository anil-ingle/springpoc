package com.nt.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.dto.EmployeeDTO;
import com.nt.service.EmployeeService;

public class CallbackInterfacesTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		EmployeeService service=null;
		EmployeeDTO dto=null;
		List<EmployeeDTO>listDTO=null;
		// create IOC container
		ctx=new FileSystemXmlApplicationContext("src/main/java/com/nt/cfgs/applicationContext.xml");
		//get Service class object
		service=ctx.getBean("empService",EmployeeService.class);
		//invoke methods
		dto=service.searchEmployeeDetailsByNo(7499);
		System.out.println(dto);
		System.out.println("----------------------------");
		listDTO=service.searchEmployeeDetailsByDesg("CLERK");
		System.out.println(listDTO);
		
		
		//close container
		((AbstractApplicationContext) ctx).close();
	}//main
}//class
