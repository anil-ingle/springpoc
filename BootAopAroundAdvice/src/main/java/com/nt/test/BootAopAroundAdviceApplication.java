package com.nt.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Import;

import com.nt.config.AopConfig;
import com.nt.config.ServiceConfig;
import com.nt.service.IntrAmtCalculator;

@SpringBootApplication
@Import(value={ServiceConfig.class,AopConfig.class})
public class BootAopAroundAdviceApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		IntrAmtCalculator proxy=null;
		ctx=SpringApplication.run(BootAopAroundAdviceApplication.class, args);
		//get Proxy object
		proxy=ctx.getBean("proxy",IntrAmtCalculator.class);
		System.out.println("Intr Amount::"+proxy.calcIntrAmount(100000,20, 2));
		System.out.println("----------------------------------------------");
		System.out.println("Intr Amount::"+proxy.calcIntrAmount(100000,20, 2));
		//close container
		((ConfigurableApplicationContext) ctx).close();
		
	}
}
