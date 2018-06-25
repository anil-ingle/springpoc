package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.dao.DataAccessException;

import com.nt.service.EmployeeService;

public class JdbcTemplateTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		EmployeeService service=null;
		
		//create IOC container
		ctx=new FileSystemXmlApplicationContext("src/main/java/com/nt/cfgs/applicationContext.xml");
		//get Bean
		service=ctx.getBean("empService",EmployeeService.class);
		try{
		//invoke methods
		//System.out.println(service.RegisterEmployee(1001,"bigB","Acting", 80000));
		System.out.println("Employees Count:::"+service.findEmployeesCount());
/*		System.out.println("7499 Employee Details:::"+service.listEmployeesByNo(7499));
		System.out.println("CLERK desg Employee Details:::"+service.listEmployeesByDesg("CLERK"));
		System.out.println("1001 Emp Salary:::"+service.findEmpSalary(1001));
		System.out.println(service.hikeEmpSalary(1001,1));
		System.out.println("1001 Employee Details:::"+service.listEmployeesByNo(1001));
		System.out.println(service.fireEmployee(1001));*/
		}
		catch(DataAccessException dae){
			dae.printStackTrace();
		}
		
		//close conntainer
		((AbstractApplicationContext) ctx).close();

	}//main
}//class
