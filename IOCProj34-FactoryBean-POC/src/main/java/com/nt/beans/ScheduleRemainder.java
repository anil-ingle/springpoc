package com.nt.beans;

import java.util.Date;

public class ScheduleRemainder {
	private Date date;

	public void setDate(Date date) {
		this.date = date;
	}
	
	public String alarm(){
			if(date.getMonth()==3 && date.getDate()==9){
				return "Happy birth my dear Cousin1-->1 year is reduced in u r lifetime.Do some thing";
			}
		else{
			return "No Remainders";
		}
	}

}//class
