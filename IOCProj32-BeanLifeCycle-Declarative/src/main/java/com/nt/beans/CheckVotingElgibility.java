package com.nt.beans;

public class CheckVotingElgibility {
	private String name;
	private int age;
	public CheckVotingElgibility() {
        System.out.println("CheckVotingElgibility:0-param constructor");
	}
	public void setName(String name) {
        System.out.println("CheckVotingElgibility:setName(-)");
		this.name = name;
	}
	public void setAge(int age) {
        System.out.println("CheckVotingElgibility:setAge(-)");
		this.age = age;
	}
	
	//Custom init method
	public void myInit(){
		System.out.println("CheckVotingElgibility:myInit()");
		if(name==null || age<0)
			throw new IllegalArgumentException("invalid inputs");
	}
	
	public String generateVotingEligilityStatus(){
		if(age<18)
			return "Mr/Miss."+name+" your not elgible to vote";
		else
			return "Mr/Miss."+name+" your  elgible to vote";	
	}//method
	
	public void myDestroy(){
 	 System.out.println("CheckVotingElgibility:myDestroy()");
		name=null;
		age=0;
	}

}//class
