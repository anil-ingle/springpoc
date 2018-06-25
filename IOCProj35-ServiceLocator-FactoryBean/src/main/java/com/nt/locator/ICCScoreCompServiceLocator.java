package com.nt.locator;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.FactoryBean;

import com.nt.external.ICCScoreComp;
import com.nt.external.ICCScoreCompImpl;

public class ICCScoreCompServiceLocator implements FactoryBean<ICCScoreComp> {
	private Map<String, ICCScoreComp> cache = new HashMap();
	private String jndiName;

	public void setJndiName(String jndiName) {
		this.jndiName = jndiName;
	}

	public ICCScoreComp getObject() throws Exception {
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

	public Class<?> getObjectType() {
		
		return ICCScoreComp.class;
	}

	public boolean isSingleton() {
		return true;
	}

}
