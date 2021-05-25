package com.ssafy.vue.dto;

public class PublicBicycleDto {
	private int no;
	private String name;
	private String gugun;
	private String address;
	private double lat;
	private double lng;
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGugun() {
		return gugun;
	}
	public void setGugun(String gugun) {
		this.gugun = gugun;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
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
	
	@Override
	public String toString() {
		return "PublicBicycle [no=" + no + ", name=" + name + ", gugun=" + gugun + ", address=" + address + ", lat="
				+ lat + ", lng=" + lng + "]";
	}
	
}
