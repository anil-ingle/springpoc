package com.nt.test;

import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.beans.PropertyEditorRegistry;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.CustomEditorConfigurer;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.IntrAmtCalculator;
import com.nt.beans.IntrAmtDetails;
import com.nt.pe.AmtDetailsPropertyEditor;

public class PropertyEditorsTest_BF1 {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
        IntrAmtCalculator calculator=null;
        XmlBeanDefinitionReader reader=null;
		//create IOC container
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions(new FileSystemResource("src/main/java/com/nt/cfgs/applicationContext.xml"));
		// add PropertyEditorRegistrar to IOC container
		//factory.addPropertyEditorRegistrar(new MyPropertyEditorRegistrar());
		//get Bean
		calculator=factory.getBean("iac",IntrAmtCalculator.class);
		
		//display details
		System.out.println("Intr Amount::"+calculator.calcIntrAmount());
		
	}//main
	
	private static class MyPropertyEditorRegistrar implements PropertyEditorRegistrar{

		@Override
		public void registerCustomEditors(PropertyEditorRegistry registry) {
			// TODO Auto-generated method stub
			registry.registerCustomEditor(IntrAmtDetails.class, new AmtDetailsPropertyEditor());
		}
	}
}//class
