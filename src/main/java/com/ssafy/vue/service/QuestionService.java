package com.ssafy.vue.service;

import java.util.List;

import com.ssafy.vue.dto.NoticeDto;
import com.ssafy.vue.dto.QuestionDto;


public interface QuestionService {
	
	public void insertQuestion(QuestionDto questionDto);
	public List<QuestionDto> getQuestionList();
	public QuestionDto readQuestion(int qnaNum);
	public void updateQuestion(int qnaNum, QuestionDto questionDto);
	public void deleteQuestion(int qnaNum);
	public int countAnswer(int qnaNum);
	
}
