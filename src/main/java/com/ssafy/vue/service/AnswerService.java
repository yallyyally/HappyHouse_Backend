package com.ssafy.vue.service;

import java.util.List;

import com.ssafy.vue.dto.AnswerDto;

public interface AnswerService {

	public void insertAnswer( AnswerDto answerDto);
	public List<AnswerDto> getAnswerList(int num);
	public void updateAnswer(AnswerDto answerDto);
	public void deleteAnswer(int num);
	public void deleteAllAnswer(int num);
}
