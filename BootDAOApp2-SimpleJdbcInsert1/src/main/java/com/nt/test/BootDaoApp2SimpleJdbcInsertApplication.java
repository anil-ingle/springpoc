package com.nt.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Import;

import com.nt.config.PersistenceConfig;
import com.nt.config.ServiceConfig;
import com.nt.dto.EmployeeDTO;
import com.nt.service.EmployeeService;

@SpringBootApplication
@Import(value={PersistenceConfig.class,ServiceConfig.class})
public class BootDaoApp2SimpleJdbcInsertApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		EmployeeService service=null;
		EmployeeDTO dto=null;
		ctx=SpringApplication.run(BootDaoApp2SimpleJdbcInsertApplication.class, args);
		//get Service Bean
		service=ctx.getBean("empService",EmployeeService.class);
		//prepare DTO class object
		dto=new EmployeeDTO();
		dto.setEmpno(1099); dto.setEname("raja"); dto.setJob("CLERK"); dto.setSal(90000);
		//invoke methods
		System.out.println(service.register(dto));
		
		//close container
		((ConfigurableApplicationContext) ctx).close();
		
	}//main
}//class
