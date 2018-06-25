package com.nt.beans;

public class MobileNetwork {
	private java.util.Set<String> phones;

	public void setPhones(java.util.Set phones) {
		this.phones = phones;
	}

	@Override
	public String toString() {
		return "MobileNetwork [phones=" + phones + "]"+"--->"+phones.getClass();
	}

	
}//class
