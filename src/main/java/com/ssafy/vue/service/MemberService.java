package com.ssafy.vue.service;

import com.ssafy.vue.dto.MemberDto;

public interface MemberService {

//	public MemberDto login(MemberDto member) throws Exception;
//	public boolean regist(MemberDto member) throws Exception;
//	public MemberDto read(String userid) throws Exception;
//	public boolean update(MemberDto member) throws Exception;
//	public boolean delete(String userid) throws Exception;
//	public String getServerInfo();
	
	public MemberDto login(MemberDto member) throws Exception;
	public int regist(MemberDto member) throws Exception;
	public int update(MemberDto member) throws Exception;
	public int delete(MemberDto member) throws Exception;
	public String getServerInfo();
}
