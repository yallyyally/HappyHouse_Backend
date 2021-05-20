package com.ssafy.vue.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.ssafy.vue.dto.QuestionDto;

@Mapper
public interface QuestionMapper {
	
	public void insertQuestion(QuestionDto questionDto);
	public List<QuestionDto> getQuestionList();
	public QuestionDto readQuestion(int qnaNum);
	public void updateQuestion(@Param("qnaNum") int qnaNum, @Param("questionDto") QuestionDto questionDto);
	public void deleteQuestion(int qnaNum);
	public int countAnswer(int qnaNum);	
}
