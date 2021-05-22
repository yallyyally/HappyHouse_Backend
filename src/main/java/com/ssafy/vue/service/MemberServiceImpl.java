package com.ssafy.vue.service;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.vue.dao.MemberMapper;
import com.ssafy.vue.dto.MemberDto;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	private SqlSession mDao;
	
	@Override
	public MemberDto login(MemberDto member) throws Exception {
		return mDao.getMapper(MemberMapper.class).login(member);
		
	}

	@Override
	public int regist(MemberDto member) throws Exception {
		return mDao.getMapper(MemberMapper.class).regist(member);
	}
//	@Override
//	public boolean regist(MemberDto member) throws Exception {
//		return mDao.getMapper(MemberMapper.class).regist(member)==1;
//	}

//	@Override
//	public MemberDto read(String userid) throws Exception {
//		return mDao.getMapper(MemberMapper.class).read(userid);
//	}

	@Override
	public int update(MemberDto member) throws Exception {
		return mDao.getMapper(MemberMapper.class).update(member);
	}
//	@Override
//	public boolean update(MemberDto member) throws Exception {
//		return mDao.getMapper(MemberMapper.class).update(member)==1;
//	}

	@Override
	public int delete(MemberDto member) throws Exception {
		return mDao.getMapper(MemberMapper.class).delete(member);
	}
//	@Override
//	public boolean delete(String userid) throws Exception {
//		return mDao.getMapper(MemberMapper.class).delete(userid)==1;
//	}

	@Override
	public String getServerInfo() {
		return "사용자에게 전달하고 싶은 중요정보";
	}

}
