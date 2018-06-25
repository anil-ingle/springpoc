package com.nt.test;



import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.nt.beans.WishMsgGenerator;

public class ConstructorInjectionTest {
	
	public static void main(String[] args) {
	 BeanFactory factory=null;	
	 Resource res=null;
	 WishMsgGenerator generator=null;
	 //locate SpringBean cfg file
	 res=new ClassPathResource("applicationContext.xml");
	 //create IOC container	
	 factory=new XmlBeanFactory(res);	
	 //get Main Bean
	 generator=(WishMsgGenerator)factory.getBean("wish");
	 //invoke method
	 System.out.println(generator.generateWishMsg("raja"));
	 
	}

}
