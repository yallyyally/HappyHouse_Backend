package com.ssafy.vue.dto;

public class MemberDto {
	private String userid;
	private String username;
	private String userpwd;
	private String phone;
	private String email;
	private String joindate;
	
	public MemberDto(String userid, String username, String userpwd, String phone, String email, String joindate) {
		super();
		this.userid = userid;
		this.username = username;
		this.userpwd = userpwd;
		this.phone = phone;
		this.email = email;
		this.joindate = joindate;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUserpwd() {
		return userpwd;
	}

	public void setUserpwd(String userpwd) {
		this.userpwd = userpwd;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getJoindate() {
		return joindate;
	}

	public void setJoindate(String joindate) {
		this.joindate = joindate;
	}

	@Override
	public String toString() {
		return "MemberDto [userid=" + userid + ", username=" + username + ", userpwd=" + userpwd + ", phone=" + phone
				+ ", email=" + email + ", joindate=" + joindate + "]";
	}
	
}
