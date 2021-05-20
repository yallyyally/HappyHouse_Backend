package com.ssafy.vue.service;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.vue.dao.AnswerMapper;
import com.ssafy.vue.dto.AnswerDto;

@Service
public class AnswerServiceImpl implements AnswerService {

	@Autowired
	private SqlSession aDao;
	
	@Override
	public void insertAnswer(AnswerDto answerDto) {
		aDao.getMapper(AnswerMapper.class).insertAnswer(answerDto);
	}

}
