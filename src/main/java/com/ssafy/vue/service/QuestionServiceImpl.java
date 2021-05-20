package com.ssafy.vue.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.vue.dao.QuestionMapper;
import com.ssafy.vue.dto.QuestionDto;

@Service
public class QuestionServiceImpl implements QuestionService {

	@Autowired
	private SqlSession qDao;
	
	@Override
	public List<QuestionDto> getQuestionList() {
		return qDao.getMapper(QuestionMapper.class).getQuestionList();
	}

	@Override
	public QuestionDto readQuestion(int queNum) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateQuestion(int queNum, QuestionDto noticeDto) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteQuestion(int queNum) {
		// TODO Auto-generated method stub

	}

	@Override
	public void insertQuestion(QuestionDto questionDto) {
		qDao.getMapper(QuestionMapper.class).insertQuestion(questionDto);
	}

}
