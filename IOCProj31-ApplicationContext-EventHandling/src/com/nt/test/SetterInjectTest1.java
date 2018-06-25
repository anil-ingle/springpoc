package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.nt.beans.WishMsgGenerator;

public class SetterInjectTest1 {

	public static void main(String[] args) {
		Resource res=null;
		WishMsgGenerator generator=null;
		BeanFactory factory=null;
		Object obj=null;
		String result=null;
		//create IOC container
		factory=new XmlBeanFactory(new FileSystemResource("src/com/nt/cfgs/applicationContext.xml"));
		//get Bean
        generator=factory.getBean("wish",WishMsgGenerator.class);
        //call method
        result=generator.generateWishMsg("raja");
        System.out.println(result); 
	}//main
}//class
