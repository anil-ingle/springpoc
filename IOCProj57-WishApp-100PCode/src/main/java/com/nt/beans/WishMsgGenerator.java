package com.nt.beans;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wish")
public class WishMsgGenerator {
	@Autowired
	private Date date;
	
	public String generate(String user){
		return "Good morning"+user+" date="+date;
	}
}//class
