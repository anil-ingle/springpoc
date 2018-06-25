package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.nt.beans.WishMsgGenerator;

public class SetterInjectTest {

	public static void main(String[] args) {
		BeanFactory factory=null;
		Resource res=null;
		WishMsgGenerator generator=null;
		Object obj=null;
		String result=null;
		//locate SpringBean cfg file
		res=new FileSystemResource("src/com/nt/cfgs/applicationContext.xml");
		//create IOC container
        factory=new XmlBeanFactory(res);
/*        //get Main/Target Bean object
        obj=factory.getBean("wish");
         
        //type casting
        generator=(WishMsgGenerator)obj;
*/
        generator=factory.getBean("wish",WishMsgGenerator.class);
        //call method
        result=generator.generateWishMsg("raja");
        System.out.println(result); 
	}//main
}//class
