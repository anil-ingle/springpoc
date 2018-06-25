package com.nt.service;

import java.util.Arrays;

public class TravelAgent {
	private TourPlan tp;
	
	public TravelAgent(TourPlan tp) {
		System.out.println("TravelAgent::1-param cosntructor");
		this.tp = tp;
	}



	public TravelAgent() {
		System.out.println("TravelAgent::0-param cosntructor");
	}
	
	

	public void setTp(TourPlan tp) {
		System.out.println("TravelAgent::setTp(-)");
		this.tp = tp;
	}

	@Override
	public String toString() {
		return "TravelAgent planed places--> [tp=" + tp + "]";
	}
	
	

}//class
