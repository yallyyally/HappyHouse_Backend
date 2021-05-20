package com.ssafy.vue.service;

import java.util.List;

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

	@Override
	public List<AnswerDto> getAnswerList(int num) {
		return aDao.getMapper(AnswerMapper.class).getAnswerList(num);
	}

	@Override
	public void updateAnswer(AnswerDto answerDto) {
		aDao.getMapper(AnswerMapper.class).updateAnswer(answerDto);
	}

	@Override
	public void deleteAnswer(int num) {
		aDao.getMapper(AnswerMapper.class).deleteAnswer(num);
	}
	
	

}
