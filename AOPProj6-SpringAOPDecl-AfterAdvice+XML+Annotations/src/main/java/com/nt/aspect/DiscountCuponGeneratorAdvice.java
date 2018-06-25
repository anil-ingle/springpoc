package com.nt.aspect;

import java.io.FileWriter;
import java.io.Writer;
import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.stereotype.Component;

@Component("cuponAdvice")
public class DiscountCuponGeneratorAdvice implements AfterReturningAdvice {

	@Override
	public void afterReturning(Object retVal, Method method, Object[] args, Object target) throws Throwable {
		 Writer writer=null;
         String discountMsg=null;
         
		 //write message
		 writer=new FileWriter("e:/cupon.txt");
		 if(((Float)retVal)>=50000)
			 discountMsg="Avail 30% discount on next purcharse";
		 else if(((Float)retVal)>=30000)
			 discountMsg="Avail 20% discount on next purcharse";
		 else if(((Float)retVal)>=20000)
			 discountMsg="Avail 10% discount on next purcharse";
		 else 
			 discountMsg="Avail 2% discount on next purcharse";
		 
		 //generate discount cupon
			writer.write(discountMsg);
		    writer.flush();
		    writer.close();
	}//afterReturning
}//class
