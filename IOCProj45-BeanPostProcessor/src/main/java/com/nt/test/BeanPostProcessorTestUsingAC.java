package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.service.StudentCustomerService;

public class BeanPostProcessorTestUsingAC {
	public static void main(String[] args) {
		 ApplicationContext ctx=null;
		 StudentCustomerService service=null;
		//create IOc Conntaier
		 ctx=new FileSystemXmlApplicationContext("src/main/java/com/nt/cfgs/applicationContext.xml");
		 //get Bean
         service=ctx.getBean("stCustService",StudentCustomerService.class);
         //call methods
         service.processCustomer(101,"raja",9000);
         service.processStudent(102, "ramesh","java");
       
         
         //close container
         ((AbstractApplicationContext) ctx).close();
		
	}

}
