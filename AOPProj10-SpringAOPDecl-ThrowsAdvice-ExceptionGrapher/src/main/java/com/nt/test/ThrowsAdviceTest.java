package com.nt.test;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.aspect.InvalidInputsException;
import com.nt.service.Shopping;

public class ThrowsAdviceTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		Shopping proxy=null;
		float price=0.0f;
		//create IOC container
		ctx=new FileSystemXmlApplicationContext("src/main/java/com/nt/cfgs/applicationContext.xml");
		//get Proxy object
		proxy=ctx.getBean("pfb",Shopping.class);
		//invoke methods
		try{
		price=proxy.shopping(100,0);
		System.out.println("Price:::"+price);
		}
		catch(InvalidInputsException iae){
			System.out.println("Client Appa::"+iae.getMessage());
		}
		catch(Exception e){
			System.out.println("Client Appb::"+e.getMessage());
		}
		
		//close container
		((AbstractApplicationContext) ctx).close();

	}

}
