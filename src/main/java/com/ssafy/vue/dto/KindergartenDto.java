package com.ssafy.vue.dto;

public class KindergartenDto { 
	private String name;
	private String ESTABLISH;
	private String address;
	private String telno;
	private String HPADDR;
	private String OPERTIME;
	private double lng;
	private double lat;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getESTABLISH() {
		return ESTABLISH;
	}
	public void setESTABLISH(String eSTABLISH) {
		ESTABLISH = eSTABLISH;
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
	public String getHPADDR() {
		return HPADDR;
	}
	public void setHPADDR(String hPADDR) {
		HPADDR = hPADDR;
	}
	public String getOPERTIME() {
		return OPERTIME;
	}
	public void setOPERTIME(String oPERTIME) {
		OPERTIME = oPERTIME;
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
	
	@Override
	public String toString() {
		return "KindergartenDto [name=" + name + ", ESTABLISH=" + ESTABLISH + ", address=" + address + ", telno="
				+ telno + ", HPADDR=" + HPADDR + ", OPERTIME=" + OPERTIME + ", lng=" + lng + ", lat=" + lat + "]";
	}
	
}
