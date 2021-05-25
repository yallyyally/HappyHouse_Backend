package com.ssafy.vue.dao;

import java.sql.SQLException;

import org.apache.ibatis.annotations.Mapper;

import com.ssafy.vue.dto.MemberDto;

@Mapper
public interface MemberMapper {

	public MemberDto login(MemberDto member) throws SQLException;
	public int regist(MemberDto member) throws SQLException;
	public MemberDto read(String userid);
	public int update(MemberDto member) throws SQLException;
//	public int delete(MemberDto member) throws SQLException;
	public int delete(String userid);
	
}
