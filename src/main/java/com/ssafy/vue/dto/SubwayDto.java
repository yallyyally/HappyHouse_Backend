package com.ssafy.vue.dto;

public class SubwayDto {
	private int no;
	private String name;
	private String routename;
	private double lng;
	private double lat;
	private String address;
	private String telno;
	public SubwayDto(int no, String name, String routename, double lng, double lat, String address, String telno) {
		super();
		this.no = no;
		this.name = name;
		this.routename = routename;
		this.lng = lng;
		this.lat = lat;
		this.address = address;
		this.telno = telno;
	}
	@Override
	public String toString() {
		return "SubwayDto [no=" + no + ", name=" + name + ", routename=" + routename + ", lng=" + lng + ", lat=" + lat
				+ ", address=" + address + ", telno=" + telno + "]";
	}
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
	public String getRoutename() {
		return routename;
	}
	public void setRoutename(String routename) {
		this.routename = routename;
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
	public String getTelno() {
		return telno;
	}
	public void setTelno(String telno) {
		this.telno = telno;
	}
	
	
}
