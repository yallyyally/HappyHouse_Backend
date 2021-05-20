package com.ssafy.vue.dto;

public class AnswerDto {
	private int qnaNum;
	private int ansNum;
	String ansContent;
	String userid;
	String ansTime;
	
	//Getter & Setter

	public int getQnaNum() {
		return qnaNum;
	}
	public void setQnaNum(int qnaNum) {
		this.qnaNum = qnaNum;
	}
	public int getAnsNum() {
		return ansNum;
	}
	public void setAnsNum(int ansNum) {
		this.ansNum = ansNum;
	}
	public String getAnsContent() {
		return ansContent;
	}
	public void setAnsContent(String ansContent) {
		this.ansContent = ansContent;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getAnsTime() {
		return ansTime;
	}
	public void setAnsTime(String ansTime) {
		this.ansTime = ansTime;
	}

	//toString
	@Override
	public String toString() {
		return "AnswerDto [qnaNum=" + qnaNum + ", ansNum=" + ansNum + ", ansContent=" + ansContent + ", userid="
				+ userid + ", ansTime=" + ansTime + "]";
	}
	
	
	
	
	
}
