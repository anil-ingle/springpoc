package com.nt.beans;

import java.util.Date;

public class AadharDetails {
	private int ano;
	private String name;
	private Date doi;
	private Date dob;
	
	public AadharDetails(int ano, String name, Date doi, Date dob) {
		System.out.println("4-param constuctor");
		this.ano = ano;
		this.name = name;
		this.doi = doi;
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "AadharDetails [ano=" + ano + ", name=" + name + ", doi=" + doi + ", dob=" + dob + "]";
	}
	
	

}
