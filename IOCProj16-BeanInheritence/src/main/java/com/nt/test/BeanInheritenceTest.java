package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import com.nt.beans.Bike;

public class BeanInheritenceTest {

	public static void main(String[] args) {
		BeanFactory factory=null;
		Bike b1=null,b2=null,b3=null,b=null;
		//create IOC container
		factory=new XmlBeanFactory(new ClassPathResource("com/nt/cfgs/applicationContext.xml"));
		//get Bean
		b1=factory.getBean("pulsor1",Bike.class);
		System.out.println(b1);
		b2=factory.getBean("pulsor2",Bike.class);
		System.out.println(b2);
		b3=factory.getBean("pulsor3",Bike.class);
		System.out.println(b3);
		
		/*b=factory.getBean("basePulsor",Bike.class);
		System.out.println(b);*/
		
		
	}//main
}//class
