package com.nt.service;

import org.springframework.stereotype.Service;

@Service("arithService")
public class ArithmeticOperations {
	
	public int add(int x,int y){
		return x+y;
	}
	public int sub(int x,int y){
		return x-y;
	}
	public int mul(int x,int y){
		return x*y;
	}
	public float div(int x,int y){
		if(y==0)
			throw new IllegalArgumentException();
		return (float)x/y;
	}
}//class
