package com.ssafy.vue.dto;

public class RouteDto {
	private int duration;
	private int distance;
	private int taxiPrice;
	private int fuelPrice;
	
	public RouteDto(int duration, int distance, int taxiPrice, int fuelPrice) {
		super();
		this.duration = duration;
		this.distance = distance;
		this.taxiPrice = taxiPrice;
		this.fuelPrice = fuelPrice;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public int getDistance() {
		return distance;
	}
	public void setDistance(int distance) {
		this.distance = distance;
	}
	public int getTaxiPrice() {
		return taxiPrice;
	}
	public void setTaxiPrice(int taxiPrice) {
		this.taxiPrice = taxiPrice;
	}
	public int getFuelPrice() {
		return fuelPrice;
	}
	public void setFuelPrice(int fuelPrice) {
		this.fuelPrice = fuelPrice;
	}
	@Override
	public String toString() {
		return "RouteDto [duration=" + duration + ", distance=" + distance + ", taxiPrice=" + taxiPrice + ", fuelPrice="
				+ fuelPrice + "]";
	}
	
}
