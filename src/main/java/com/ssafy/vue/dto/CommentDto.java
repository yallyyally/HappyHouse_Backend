package com.ssafy.vue.dto;

import java.util.Date;

public class CommentDto {

	private int cno;
	private int bno;
	private String userid;
	private String ccontent;
	private Date cregdate;
	
	public int getCno() {
		return cno;
	}
	public void setCno(int cno) {
		this.cno = cno;
	}
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
	public String getCcontent() {
		return ccontent;
	}
	public void setCcontent(String ccontent) {
		this.ccontent = ccontent;
	}
	public Date getCregdate() {
		return cregdate;
	}
	public void setCregdate(Date cregdate) {
		this.cregdate = cregdate;
	}
	
	@Override
	public String toString() {
		return "CommentDto [cno=" + cno + ", bno=" + bno + ", userid=" + userid + ", ccontent=" + ccontent
				+ ", cregdate=" + cregdate + "]";
	}
	
}
