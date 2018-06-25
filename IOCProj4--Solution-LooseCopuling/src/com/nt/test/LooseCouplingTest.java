package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.Flipkart;

public class LooseCouplingTest {

	public static void main(String[] args) {
		BeanFactory factory=null;
		Flipkart flipkart=null;
		String billSlip=null;
		//create IOC container
		factory=new XmlBeanFactory(new FileSystemResource("src/com/nt/cfgs/applicationContext.xml"));
		//get Bean(main bean)
		flipkart=factory.getBean("fkt",Flipkart.class);
		billSlip=flipkart.shopping(new String[]{"fruits","dvds","Bhang"});
		System.out.println(billSlip);
	}//main
}//class
