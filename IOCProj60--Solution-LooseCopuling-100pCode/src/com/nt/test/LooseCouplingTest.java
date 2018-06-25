package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.nt.beans.Flipkart;
import com.nt.config.BeanConfigurator;

public class LooseCouplingTest {

	public static void main(String[] args) {
        ApplicationContext ctx=null;
		Flipkart flipkart=null;
		String billSlip=null;
		//create IOC container
		ctx=new AnnotationConfigApplicationContext(BeanConfigurator.class);
		//get Bean(main bean)
		flipkart=ctx.getBean("flipkart",Flipkart.class);
		billSlip=flipkart.shopping(new String[]{"fruits","dvds","Bhang"});
		System.out.println(billSlip);
		//close container
		((AbstractApplicationContext) ctx).close();
	}//main
}//class
