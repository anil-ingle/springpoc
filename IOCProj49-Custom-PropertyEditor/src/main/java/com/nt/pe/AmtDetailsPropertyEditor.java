package com.nt.pe;

import java.beans.PropertyEditorSupport;

import com.nt.beans.IntrAmtDetails;

public class AmtDetailsPropertyEditor extends PropertyEditorSupport {

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		int pAmt=0,rate=0,time=0;
		//read property values
		pAmt=Integer.parseInt(text.substring(0,text.indexOf(',')));
		time=Integer.parseInt(text.substring(text.indexOf(',')+1,text.lastIndexOf(',')));
		rate=Integer.parseInt(text.substring(text.lastIndexOf(',')+1,text.length()));
		//create IntrAmtDetails object
		IntrAmtDetails details=new IntrAmtDetails();
		details.setpAmt(pAmt); details.setTime(time);details.setRate(rate);
		
		//set Value
		setValue(details);
		
	}
}	