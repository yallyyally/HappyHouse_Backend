package com.ssafy.vue.dto;

public class SearchHouseDealDto {
	private String dong;
	private String aptname;
	private int dealamount_start;
	private int dealamount_end;
	
	public SearchHouseDealDto(String dong, String aptname, int dealamount_start, int dealamount_end) {
		super();
		this.dong = dong;
		this.aptname = aptname;
		this.dealamount_start = dealamount_start;
		this.dealamount_end = dealamount_end;
	}
	public SearchHouseDealDto() {}
	
	public String getDong() {
		return dong;
	}
	public void setDong(String dong) {
		this.dong = dong;
	}
	public String getAptname() {
		return aptname;
	}
	public void setAptname(String aptname) {
		this.aptname = aptname;
	}
	public int getDealamount_start() {
		return dealamount_start;
	}
	public void setDealamount_start(int dealamount_start) {
		this.dealamount_start = dealamount_start;
	}
	public int getDealamount_end() {
		return dealamount_end;
	}
	public void setDealamount_end(int dealamount_end) {
		this.dealamount_end = dealamount_end;
	}
	@Override
	public String toString() {
		return "SearchHouseDealDto [dong=" + dong + ", aptname=" + aptname + ", dealamount_start=" + dealamount_start
				+ ", dealamount_end=" + dealamount_end + "]";
	}
	
	
	

}

