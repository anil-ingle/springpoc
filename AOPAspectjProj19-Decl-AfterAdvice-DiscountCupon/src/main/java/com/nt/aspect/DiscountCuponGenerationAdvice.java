package com.nt.aspect;

import java.io.FileWriter;

import org.aspectj.lang.JoinPoint;

public class DiscountCuponGenerationAdvice {
	
	public void  generateCupon(JoinPoint jp,float billAmt)throws Throwable{
		String cuponMsg=null;
		FileWriter writer=null;
		
		if(billAmt>=30000)
			cuponMsg="Avail 30% discount on next purchase";
		else if(billAmt>=20000)
			cuponMsg="Avail 20% discount on next purchase";
		else if(billAmt>=10000)
			cuponMsg="Avail 10% discount on next purchase";
		else
			cuponMsg="Avail 2% discount on next purchase";
		//write to file
		writer=new FileWriter("e:/cupon.txt");
		writer.write(cuponMsg);
		writer.flush();
		writer.close();
	}//generate

}
