package com.ssafy.vue.service;

import java.util.List;

import com.ssafy.vue.dto.NoticeDto;
import com.ssafy.vue.dto.QuestionDto;


public interface QuestionService {
	
	public void insertQuestion(QuestionDto questionDto);
	public List<QuestionDto> getQuestionList();
	public QuestionDto readQuestion(int queNum);
	public void updateQuestion(int queNum, QuestionDto noticeDto);
	public void deleteQuestion(int queNum);
	
}
