package com.nt.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Value;

@Named("voter")
public class Voter {
	@Value("raja")
	private String name;
	@Value("40")
	private int age;
	
	@PostConstruct
	public void myInit()throws Exception{
		if(age<=0 || name==null)
			throw new IllegalArgumentException("invalid inputs");
	}
	
	public String checkVotingEligibility(){
		if(age<18)
			return "Mr/Miss/Mrs."+name+" u r not elgible to vote";
		else
			return "Mr/Miss/Mrs."+name+" u r  elgible to vote";	
	}
	
	@PreDestroy
	public void myDestroy(){
		name=null;
		age=0;
	}
}//class
