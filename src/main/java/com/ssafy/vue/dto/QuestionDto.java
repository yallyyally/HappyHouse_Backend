package com.ssafy.vue.dto;

public class QuestionDto {
	
	private int qnaNum;
	private String queTitle;
	private String queContent;
	private String queTime;
	private String userid;
	
	//Getter, Setter
	public int getQnaNum() {
		return qnaNum;
	}

	public void setQnaNum(int qnaNum) {
		this.qnaNum = qnaNum;
	}

	public String getQueTitle() {
		return queTitle;
	}

	public void setQueTitle(String queTitle) {
		this.queTitle = queTitle;
	}

	public String getQueContent() {
		return queContent;
	}

	public void setQueContent(String queContent) {
		this.queContent = queContent;
	}

	public String getQueTime() {
		return queTime;
	}

	public void setQueTime(String queTime) {
		this.queTime = queTime;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	//String
	@Override
	public String toString() {
		return "QuestionDto [qnaNum=" + qnaNum + ", queTitle=" + queTitle + ", queContent=" + queContent + ", queTime="
				+ queTime + ", userid=" + userid + "]";
	}


	
}
