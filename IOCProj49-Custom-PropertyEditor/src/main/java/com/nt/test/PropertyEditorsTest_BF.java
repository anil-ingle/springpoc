package com.nt.test;

import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.CustomEditorConfigurer;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.IntrAmtCalculator;

public class PropertyEditorsTest_BF {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
        IntrAmtCalculator calculator=null;
        XmlBeanDefinitionReader reader=null;
        BeanFactoryPostProcessor processor=null;
		//create IOC container
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions(new FileSystemResource("src/main/java/com/nt/cfgs/applicationContext.xml"));
		//get BeanFactoryPostProcessor (CustomEditorConfigurer)
		processor=factory.getBean("cec",CustomEditorConfigurer.class);
		processor.postProcessBeanFactory(factory);
		
		//get Bean
		calculator=factory.getBean("iac",IntrAmtCalculator.class);
		//display details
		System.out.println("Intr Amount::"+calculator.calcIntrAmount());
	}//main
}//class
