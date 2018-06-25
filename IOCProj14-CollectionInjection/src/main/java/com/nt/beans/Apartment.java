package com.nt.beans;

import java.util.List;

public class  Apartment{
	   private  List <String> ownerNames;
	   
	   private Apartment(){
		   System.out.println("Appartment:0-param constructor");
	   }

	   public void setOwnerNames(List<String> ownerNames){
	      this.ownerNames=ownerNames;
	    }

	  public String toString(){
	    return ownerNames.toString()+"--->"+ownerNames.getClass();
	   }
	 }