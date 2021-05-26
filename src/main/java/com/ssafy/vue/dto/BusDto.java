package com.ssafy.vue.dto;

public class BusDto {
	private int no;
	private String name;
	private double lng;
	private double lat;
	private String address;
	
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
	public double getLng() {
		return lng;
	}
	public void setLng(double lng) {
		this.lng = lng;
	}
	public double getLat() {
		return lat;
	}
	public void setLat(double lat) {
		this.lat = lat;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "BusDto [no=" + no + ", name=" + name + ", lng=" + lng + ", lat=" + lat + ", address=" + address + "]";
	}
	
}
