package com.ssafy.vue.dto;

public class BaseaddrDto {
	private String city;
	private String code;
	private String dongcode;
	private String gugun;
	private String dong;
	private double lat;
	private double lng;
	@Override
	public String toString() {
		return "BaseaddrDto [city=" + city + ", code=" + code + ", dongcode=" + dongcode + ", gugun=" + gugun
				+ ", dong=" + dong + ", lat=" + lat + ", lng=" + lng + "]";
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getDongcode() {
		return dongcode;
	}
	public void setDongcode(String dongcode) {
		this.dongcode = dongcode;
	}
	public String getGugun() {
		return gugun;
	}
	public void setGugun(String gugun) {
		this.gugun = gugun;
	}
	public String getDong() {
		return dong;
	}
	public void setDong(String dong) {
		this.dong = dong;
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
