package com.ssafy.vue.dto;

import java.util.Date;

public class BoardDto {
	private int bno;
	private String userid;
	private String btitle;
	private String bcontent;
	private Date bregtime;
	
	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getBtitle() {
		return btitle;
	}
	public void setBtitle(String btitle) {
		this.btitle = btitle;
	}
	public String getBcontent() {
		return bcontent;
	}
	public void setBcontent(String bcontent) {
		this.bcontent = bcontent;
	}
	public Date getBregtime() {
		return bregtime;
	}
	public void setBregtime(Date bregtime) {
		this.bregtime = bregtime;
	}
	
	@Override
	public String toString() {
		return "BoardDto [bno=" + bno + ", userid=" + userid + ", btitle=" + btitle + ", bcontent=" + bcontent
				+ ", bregtime=" + bregtime + "]";
	}
	
}	