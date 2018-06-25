package com.nt.service;

import java.util.Arrays;

public class TourPlan {
	private String places[];

	public TourPlan() {
		System.out.println("TourPlan:0-param constructor");
	}
	
	public String[] getPlaces() {
		return places;
	}

	public void setPlaces(String[] places) {
		this.places = places;
	}

	@Override
	public String toString() {
		return "TourPlan [places=" + Arrays.toString(places) + "]";
	}
	
	

}
