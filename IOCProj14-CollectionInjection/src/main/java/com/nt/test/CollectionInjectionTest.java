package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nt.beans.Apartment;
import com.nt.beans.FruitShop;
import com.nt.beans.MobileNetwork;
import com.nt.beans.Student;
import com.nt.beans.University;

public class CollectionInjectionTest {

	public static void main(String[] args) {
		BeanFactory factory=null;
		Student stud=null;
		Apartment apt=null;
		MobileNetwork mbn=null;
		University unsty=null;
		FruitShop shop=null;
		//create IOC container
		factory=new XmlBeanFactory(new ClassPathResource("com/nt/cfgs/applicationContext.xml"));
		//get Bean 
		stud=factory.getBean("st",Student.class);
		System.out.println(stud);
		System.out.println("------------------------");
		apt=factory.getBean("apt",Apartment.class);
		System.out.println(apt);
		System.out.println("--------------------------");
		mbn=factory.getBean("mbn",MobileNetwork.class);
		System.out.println(mbn);
		System.out.println("-------------------------------");
		unsty=factory.getBean("unsty",University.class);
		System.out.println(unsty);
		System.out.println("------------------------------");
		 shop=factory.getBean("shop",FruitShop.class);
		 System.out.println(shop);
		
	}//main
}//class
