package com.nt.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class CheckingVotingElgibility implements InitializingBean,DisposableBean {
	private String name;
	private int age;
	
	
	public void setName(String name) {
		System.out.println("setName(-)");
		this.name = name;
	}
	public void setAge(int age) {
		System.out.println("setAge(-)");
		this.age = age;
	}
	
	
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet()");
	   if(name==null || age<=0)
		   throw new IllegalArgumentException("invalid inputs");
		
	}
	
	
	
	//b.method
	public String checkElgibility(){
		if(age<18)
			return name+" u r not elgible to vote";
		else
			return name+" u r  elgible to vote";
	}
	
	public void destroy() throws Exception {
		System.out.println("destroy()");
		name=null;
		age=0;
	}

}//class
