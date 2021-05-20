package com.ssafy.vue.service;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.vue.dao.MemberMapper;
import com.ssafy.vue.dto.MemberDto;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	private SqlSession mdao;
	
	@Override
	public MemberDto login(MemberDto memberDto) throws Exception {
		return mdao.getMapper(MemberMapper.class).login(memberDto);
	}

	@Override
	public boolean regist(MemberDto memberDto) throws Exception {
		return mdao.getMapper(MemberMapper.class).regist(memberDto)==1;
	}

	@Override
	public MemberDto read(String userid) throws Exception {
		return mdao.getMapper(MemberMapper.class).read(userid);
	}

	@Override
	public boolean update(MemberDto memberDto) throws Exception {
		return mdao.getMapper(MemberMapper.class).update(memberDto)==1;
	}

	@Override
	public boolean delete(String userid) throws Exception {
		return mdao.getMapper(MemberMapper.class).delete(userid)==1;
	}

	@Override
	public String getServerInfo() {
		return "사용자에게 전달하고 싶은 중요정보";
	}

}
