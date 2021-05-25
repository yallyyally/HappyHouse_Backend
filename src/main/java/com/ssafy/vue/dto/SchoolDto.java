package com.ssafy.vue.dto;

public class SchoolDto {
	private String name;
	private String telno;
	private String homepage;
	private String info;
	private String highschoolkind;
	private String address;
	private double lat;
	private double lng;
	@Override
	public String toString() {
		return "SchoolDto [name=" + name + ", telno=" + telno + ", homepage=" + homepage + ", info=" + info
				+ ", highschoolkind=" + highschoolkind + ", address=" + address + ", lat=" + lat + ", lng=" + lng + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTelno() {
		return telno;
	}
	public void setTelno(String telno) {
		this.telno = telno;
	}
	public String getHomepage() {
		return homepage;
	}
	public void setHomepage(String homepage) {
		this.homepage = homepage;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public String getHighschoolkind() {
		return highschoolkind;
	}
	public void setHighschoolkind(String highschoolkind) {
		this.highschoolkind = highschoolkind;
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
	
	
}
