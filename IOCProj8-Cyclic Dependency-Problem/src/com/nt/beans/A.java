package com.nt.beans;

public class A {
	private B b;
	
	public A(B b){
		this.b=b;
	}

	@Override
	public String toString() {
		return "from A";
	}
	
	

}
