package com.nt.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Import;

import com.nt.service.IntrAmountCalculator;

@SpringBootApplication
@Import(value={AopConfig.class,ServiceConfig.class})
public class BootAopAspectj24AroundAdviceApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		IntrAmountCalculator proxy=null;
		ctx=SpringApplication.run(BootAopAspectj24AroundAdviceApplication.class, args);
		//get Proxy object
		proxy=ctx.getBean("iac",IntrAmountCalculator.class);
		//invoke methods
		System.out.println("Simple IntrestAmount::"+proxy.calcSimpleIntrAmount(100000, 2, 20));
		System.out.println("-----------------------------------------------");
		System.out.println("Compound IntrestAmount::"+proxy.calcCompoundIntrAmount(100000, 2, 20));
		//close Container
		((ConfigurableApplicationContext) ctx).close();
		
	}
}
