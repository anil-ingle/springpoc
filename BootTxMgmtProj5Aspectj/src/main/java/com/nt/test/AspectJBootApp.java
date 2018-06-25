package com.nt.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Import;

import com.nt.config.AopConfig;
import com.nt.config.PersitenceConfig;
import com.nt.config.ServiceConfig;
import com.nt.service.BankService;

@SpringBootApplication
@Import(value={PersitenceConfig.class,ServiceConfig.class,AopConfig.class})
public class AspectJBootApp {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		BankService proxy=null;
		//get IOC container
		ctx=SpringApplication.run(AspectJBootApp.class, args);
		//get Proxy class object
		proxy=ctx.getBean("bankService",BankService.class);
		try{
		//invoke methods
		System.out.println("Money transfered"+proxy.transferMoney(101,104, 1000));
		}
		catch(Exception e){
			System.out.println("Money not transfered");
		}
		//close container
		((ConfigurableApplicationContext) ctx).close();
	}//main
}//class
