package com.nt.service;

import java.util.Random;

public class ATMPinGenerator {
	
	public  int  generatePin(){
		Random rad=null;
		int pin=0;
		
		rad=new Random();
		pin=rad.nextInt(100000);
		return pin;
	}

}
