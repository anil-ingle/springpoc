package com.nt.serviceLocator;

import java.util.HashMap;
import java.util.Map;

import com.nt.external.ICCScoreComp;
import com.nt.external.ICCScoreCompImpl;

public class ICCScoreCompServiceLocator {
	private static Map<String,ICCScoreComp> cache=new HashMap();
	
	public static ICCScoreComp  getService(String jndiName){
		 ICCScoreComp comp=null;
		if(!cache.containsKey(jndiName)){
			//write jndi lookup code ,since not possible directly create object for extendal service
			comp=new ICCScoreCompImpl();
			cache.put(jndiName, comp);
			return comp;
		}
		else{
			return cache.get(jndiName);
		}
	}//method
}//class
