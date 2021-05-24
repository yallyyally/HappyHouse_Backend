package com.ssafy.vue.dto;

public class CultureDto {
	private String subject;
	private String name;
	private String address;
	private double lat;
	private double lng;
	private String telno;
	private String close;
	private String imformation;
	private int no;
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	@Override
	public String toString() {
		return "CultureDto [subject=" + subject + ", name=" + name + ", address=" + address + ", lat=" + lat + ", lng="
				+ lng + ", telno=" + telno + ", close=" + close + ", imformation=" + imformation + "]";
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public String getTelno() {
		return telno;
	}
	public void setTelno(String telno) {
		this.telno = telno;
	}
	public String getClose() {
		return close;
	}
	public void setClose(String close) {
		this.close = close;
	}
	public String getImformation() {
		return imformation;
	}
	public void setImformation(String imformation) {
		this.imformation = imformation;
	}
	
	
	
	
	
}
