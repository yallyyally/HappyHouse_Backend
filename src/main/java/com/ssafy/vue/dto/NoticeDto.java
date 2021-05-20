package com.ssafy.vue.dto;

public class NoticeDto {
	private int num;
	private String title;
	private String content;
	private String regtime;
	
	//Getter, Setter
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getRegtime() {
		return regtime;
	}

	public void setRegtime(String regtime) {
		this.regtime = regtime;
	}
	
	
	//toString
	@Override
	public String toString() {
		return "NoticeDto [num=" + num + ", title=" + title + ", content=" + content + ", regtime=" + regtime + "]";
	}


	
}
