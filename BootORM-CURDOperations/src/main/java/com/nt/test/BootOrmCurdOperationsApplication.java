package com.nt.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Import;

import com.nt.config.AOPConfig;
import com.nt.config.PersistenceConfig;
import com.nt.config.ServiceConfig;
import com.nt.dto.EmployeeDTO;
import com.nt.service.EmployeeService;

@SpringBootApplication
@Import({PersistenceConfig.class,ServiceConfig.class,AOPConfig.class})
public class BootOrmCurdOperationsApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
	     EmployeeService service=null;
	     EmployeeDTO dto=null;
		ctx=SpringApplication.run(BootOrmCurdOperationsApplication.class, args);
		//get SErvice bean
		service=ctx.getBean("empService",EmployeeService.class);
		//preare DTO
		dto=new EmployeeDTO();
		dto.setFirstName("Raja"); dto.setLastName("ramesh"); dto.setEmail("raja@x.com");
		//invoke methods
		System.out.println(service.registerEmployee(dto));
		//close container
		((ConfigurableApplicationContext) ctx).close();
		
		
	}
}
