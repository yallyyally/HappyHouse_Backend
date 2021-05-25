package com.ssafy.vue.dto;

public class CameraDto {
	private double lat;
	private double lng;
	@Override
	public String toString() {
		return "CameraDto [lat=" + lat + ", lng=" + lng + "]";
	}
	public double getLat() {
		return lat;
	}
	public void setLat(double lat) {
		this.lat = lat;
	}
	public double getLng() {
		return lng;
	}
	public void setLng(double lng) {
		this.lng = lng;
	}
	
	
}
