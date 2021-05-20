package com.ssafy.vue.service;

import com.ssafy.vue.dto.MemberDto;

public interface MemberService {

	public MemberDto login(MemberDto memberDto) throws Exception;
	public boolean regist(MemberDto memberDto) throws Exception;
	public MemberDto read(String userid) throws Exception;
	public boolean update(MemberDto memberDto) throws Exception;
	public boolean delete(String userid) throws Exception;
	public String getServerInfo();
	
}
