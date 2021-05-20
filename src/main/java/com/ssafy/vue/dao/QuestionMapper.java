package com.ssafy.vue.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.ssafy.vue.dto.QuestionDto;

@Mapper
public interface QuestionMapper {
	
	public void insertQuestion(QuestionDto questionDto);
	public List<QuestionDto> getQuestionList();
	public QuestionDto readQuestion(int queNum);
	public void updateQuestion(@Param("queNum") int queNum, @Param("QuestionDto") QuestionDto questionDto);
	public void deleteQuestion(int queNum);	
}
