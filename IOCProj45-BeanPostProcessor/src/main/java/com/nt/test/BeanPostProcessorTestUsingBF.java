package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.bpp.BaseBOBeanPostProcessor;
import com.nt.service.StudentCustomerService;

public class BeanPostProcessorTestUsingBF {
	public static void main(String[] args) {
		 BeanFactory factory=null;
		 StudentCustomerService service=null;
		//create IOc Conntaier
		 factory=new XmlBeanFactory(new FileSystemResource("src/main/java/com/nt/cfgs/applicationContext.xml"));
		 
		 ((DefaultListableBeanFactory)factory).addBeanPostProcessor(new BaseBOBeanPostProcessor());
		 
		 //get Bean
         service=factory.getBean("stCustService",StudentCustomerService.class);
         //call methods
         service.processCustomer(101,"raja",9000);
         service.processStudent(102, "ramesh","java");
       
         
		
	}

}
