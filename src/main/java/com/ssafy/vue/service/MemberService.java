package com.ssafy.vue.service;

import com.ssafy.vue.dto.MemberDto;

public interface MemberService {

	public MemberDto login(MemberDto member) throws Exception;
	public int regist(MemberDto member) throws Exception;
//	public MemberDto read(String userid) throws Exception;
	public int update(MemberDto member) throws Exception;
	public int delete(MemberDto member) throws Exception;
	public String getServerInfo();
	
}
