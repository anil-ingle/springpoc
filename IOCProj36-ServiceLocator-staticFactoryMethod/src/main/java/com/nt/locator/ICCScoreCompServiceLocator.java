package com.nt.locator;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.FactoryBean;

import com.nt.external.ICCScoreComp;
import com.nt.external.ICCScoreCompImpl;

public class ICCScoreCompServiceLocator{
	private static Map<String, ICCScoreComp> cache = new HashMap();

	public static ICCScoreComp  getService(String jndiName) throws Exception {
		ICCScoreComp comp = null;
		// write Jndi Lookup Code..Since not possible we create object
		// for External Service class manually
		if (cache.containsKey(jndiName))
			return cache.get(jndiName);
		else {
			comp = new ICCScoreCompImpl();
			cache.put(jndiName, comp);
			return comp;
		}
	}
	
}
