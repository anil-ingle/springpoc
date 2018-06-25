package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.beans.Flipkart;

public class PreInstantiationTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		Flipkart flipkart=null;
		String billSlip=null;
		//create IOC container
         ctx=new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
         
         
         
		/*//get Bean(main bean)
		flipkart=factory.getBean("fkt",Flipkart.class);
	
		billSlip=flipkart.shopping(new String[]{"fruits","dvds","Bhang"});
		System.out.println(billSlip);*/
	}//main
}//class
