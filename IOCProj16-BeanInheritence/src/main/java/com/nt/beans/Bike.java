package com.nt.beans;

public class Bike {
	private String bikeId;
	private String color;
	private String engineCC;
	private String make;

	public String getBikeId() {
		return bikeId;
	}

	public void setBikeId(String bikeId) {
		this.bikeId = bikeId;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getEngineCC() {
		return engineCC;
	}

	public void setEngineCC(String engineCC) {
		this.engineCC = engineCC;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	@Override
	public String toString() {
		return "Bike [bikeId=" + bikeId + ", color=" + color + ", engineCC=" + engineCC + ", make=" + make + "]";
	}
	
	

}
