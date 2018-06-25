package com.nt.bo;

public class CustomerBO extends BaseBO {
	private float billAmt;

	public CustomerBO() {
	 System.out.println("CustomerBO:0-param constructor");
	}
	public float getBillAmt() {
		return billAmt;
	}

	public void setBillAmt(float billAmt) {
		this.billAmt = billAmt;
	}

	@Override
	public String toString() {
		return "CustomerBO [billAmt=" + billAmt + ", getId()=" + getId() + ", getName()=" + getName() + ", getDoj()="
				+ getDoj() + "]";
	} 
	
	

}
