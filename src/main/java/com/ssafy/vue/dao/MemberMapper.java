package com.ssafy.vue.dao;

import java.sql.SQLException;

import org.apache.ibatis.annotations.Mapper;

import com.ssafy.vue.dto.MemberDto;

@Mapper
public interface MemberMapper {

	public MemberDto login(MemberDto memberDto) throws SQLException;
	public int regist(MemberDto memberDto);
	public MemberDto read(String userid);
	public int update(MemberDto memberDto);
	public int delete(String userid);
	
}
